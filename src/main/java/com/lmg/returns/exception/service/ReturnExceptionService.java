package com.lmg.returns.exception.service;

import com.lmg.returns.exception.model.order.returns.*;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponseOrderLines;
import com.lmg.returns.exception.util.ApplicationConfig;
import com.lmg.returns.exception.util.RequestMapper;
import com.lmg.returns.exception.util.ReturnExceptionHelper;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service("returnExceptionService")
@Slf4j
public class ReturnExceptionService {

    @Autowired
    OrderService orderService;

    @Autowired
    ReturnRefundEnquiryService returnRefundEnquiryService;

    @Setter
    @Autowired
    ApplicationConfig applicationConfig;

    public Mono<Void> processReturnException(ReturnExceptionReq returnExceptionReq) {
        Map<String, Object> contextMap = new HashMap<>();
        Mono<CustomerOrderDetailsResponse> customerOrder = orderService.getCustomerOrder(
                returnExceptionReq.getCustomerOrderId(), returnExceptionReq.getEnterpriseCode());
        customerOrder.subscribe(customerOrderDetailsResponse -> {
            contextMap.put("customerOrder", customerOrderDetailsResponse);
            processReturnException(returnExceptionReq, contextMap);
        }, onException -> System.out.println(onException)); //TODO
        return Mono.empty();
    }

    private void processReturnException(ReturnExceptionReq returnExceptionReq, Map<String, Object> contextMap) {
        setContextMap(returnExceptionReq, contextMap);
        contextMap.put("itemIdToCustomerOrderLineMap", ReturnExceptionHelper.getItemIdToOrderLineMap(contextMap));

        List<ReturnExcessReqOrderLine> eligibleReturnLines = getEligibleReturnLines(returnExceptionReq, contextMap);
        List<ReturnExcessReqOrderLine> nonEligibleReturnLines = new ArrayList(CollectionUtils.subtract(
                returnExceptionReq.getOrderLines(), eligibleReturnLines));

        processEligibleReturnLines(eligibleReturnLines, contextMap);

        processNonEligibleReturnLines(nonEligibleReturnLines, contextMap);
    }


    private void setContextMap(ReturnExceptionReq returnExceptionReq, Map<String, Object> contextMap) {
        contextMap.put("customerOrderId", returnExceptionReq.getCustomerOrderId());
        contextMap.put("enterpriseCode", returnExceptionReq.getEnterpriseCode());
        contextMap.put("customerReturnOrderId", returnExceptionReq.getCustomerReturnOrderId());
    }


    /**
     *
     * @param eligibleReturnLines
     * @param contextMap
     */
    private void processEligibleReturnLines(List<ReturnExcessReqOrderLine> eligibleReturnLines,
                                            Map<String, Object> contextMap) {

        if(CollectionUtils.isEmpty(eligibleReturnLines)) {
            return;
        }

        getReturnableQtyByItemId(eligibleReturnLines, contextMap);

       if(canAcceptAllExcessQtys(eligibleReturnLines, contextMap)) {
           getRefundOptionsAndCreateReturn(eligibleReturnLines, contextMap);
       } else {
           handleLinesWithQtyHigherThanReturnableQty(eligibleReturnLines, contextMap);
       }
    }

    private void handleLinesWithQtyHigherThanReturnableQty(List<ReturnExcessReqOrderLine> eligibleReturnLines,
                                                           Map<String, Object> contextMap) {
        getReturnOrdersForCustomerSalesOrder(contextMap).subscribe(returnOrdersResponse -> {
            contextMap.put("returnOrders", returnOrdersResponse);
            reclaimReturnableQtyAndCreateReturn(eligibleReturnLines, contextMap);
        });
    }

    private void reclaimReturnableQtyAndCreateReturn(List<ReturnExcessReqOrderLine> eligibleReturnLines, Map<String, Object> contextMap) {
        Map<String, BigDecimal> itemIdToReturnableQty = (Map<String, BigDecimal>) contextMap.get("itemIdToReturnableQty");
        List<ReturnExcessReqOrderLine> linesWithNonProcessedExcessQty = new ArrayList<>();

        for (ReturnExcessReqOrderLine returnEligibleLine : eligibleReturnLines) {
             String itemId = returnEligibleLine.getItemId();
             BigDecimal returnableQty = itemIdToReturnableQty.get(itemId);
             BigDecimal excessQty = returnEligibleLine.getExcessQuantity();
             /**
              * If returnableQty is less than excessQty, fetch and delete existing return orders
              */
             if (returnableQty.compareTo(excessQty) < 0) {
                 reclaimReturnableQty(returnEligibleLine, contextMap);
                 returnableQty = itemIdToReturnableQty.get(itemId);
             }

             if (returnableQty.compareTo(excessQty) < 0) {
                 BigDecimal diffQty = excessQty.subtract(returnableQty);
                 returnEligibleLine.setExcessQuantity(returnableQty);
                 itemIdToReturnableQty.put(itemId, BigDecimal.ZERO);
                 ReturnExcessReqOrderLine lineWithNonProcessedExcessQty = SerializationUtils.clone(returnEligibleLine);
                 lineWithNonProcessedExcessQty.setExcessQuantity(diffQty);
                 linesWithNonProcessedExcessQty.add(lineWithNonProcessedExcessQty);
             }
         }

        if(CollectionUtils.isNotEmpty(linesWithNonProcessedExcessQty)) {
            processNonEligibleReturnLines(linesWithNonProcessedExcessQty, contextMap);
        }
        //TODO cancel return orders if any
        deleteExistingReturnOrders(contextMap);
        getRefundOptionsAndCreateReturn(eligibleReturnLines, contextMap);
    }

    private void getRefundOptionsAndCreateReturn(List<ReturnExcessReqOrderLine> eligibleReturnLines, Map<String, Object> contextMap) {
        ReturnRefundEnquiryReq returnRefundEnquiryReq = RequestMapper.convertToReturnRefundEnquiryReq(eligibleReturnLines, contextMap);
        Mono<ReturnRefundEnquiryResp> returnRefundEnquiryResp = returnRefundEnquiryService.getRefundDetails(returnRefundEnquiryReq);
        returnRefundEnquiryResp.subscribe(returnRefundEnquiry -> {
            CreateReturnsReq createReturnsReq = RequestMapper.convertToCreateReturnsReq(returnRefundEnquiry, contextMap);
            orderService.createReturnOrders(createReturnsReq);
        });
    }

    private boolean canAcceptAllExcessQtys(List<ReturnExcessReqOrderLine> eligibleReturnLines,
                                           Map<String, Object> contextMap) {
        Map<String, BigDecimal> itemIdToReturnableQty = (Map<String, BigDecimal>) contextMap.get("itemIdToReturnableQty");
        ReturnExcessReqOrderLine excessQtyMoreThanReturnableQtyLine = eligibleReturnLines.stream()
                .filter(returnLine -> returnLine.getExcessQuantity().compareTo(itemIdToReturnableQty.get(returnLine.getItemId())) > 0)
                .findAny()
                .orElse(null);
        return excessQtyMoreThanReturnableQtyLine == null;
    }



    private void deleteExistingReturnOrders(Map<String, Object> contextMap) {
        Set<String> returnOrdersToCancel = (Set<String>) contextMap.get("returnOrdersToCancel");
        if(CollectionUtils.isNotEmpty(returnOrdersToCancel)) {
            returnOrdersToCancel.stream()
                    .forEach(returnOrderId -> orderService.deleteReturnOrder(returnOrderId,
                            contextMap.get("enterpriseCode").toString()));
        }
    }


    private void reclaimReturnableQty(ReturnExcessReqOrderLine returnEligibleLine, Map<String, Object> contextMap) {
        Map<String, BigDecimal> itemIdToReturnableQty = (Map<String, BigDecimal>) contextMap.get("itemIdToReturnableQty");

        Set<String> returnOrdersToCancel = (Set<String>) contextMap.get("returnOrdersToCancel");
        if (returnOrdersToCancel == null) {
            returnOrdersToCancel = new HashSet<>();
            contextMap.put("returnOrdersToCancel", returnOrdersToCancel);
        }

        String itemId = returnEligibleLine.getItemId();

        List<ReturnOrdersResponseReturnOrders> cancellableReturnOrders =
                getCancellableReturnOrdersForAnItem(returnEligibleLine, contextMap);

        for (ReturnOrdersResponseReturnOrders cancellableReturnOrder : cancellableReturnOrders) {
            List<ReturnRefundEnquiryReqOrderLines> returnLines = cancellableReturnOrder.getOrderLines().stream()
                    .filter(returnLine -> returnLine.getItemId().equals(itemId))
                    .collect(Collectors.toList());
            for (ReturnRefundEnquiryReqOrderLines returnLine : returnLines) {
                BigDecimal updatedReturnableQty = itemIdToReturnableQty.get(itemId).add(returnLine.getReturnQuantity());
                returnLine.setReturnQuantity(BigDecimal.ZERO);
                itemIdToReturnableQty.put(itemId, updatedReturnableQty);
                returnOrdersToCancel.add(cancellableReturnOrder.getCustomerReturnOrderId());
                if (updatedReturnableQty.compareTo(returnEligibleLine.getExcessQuantity()) >= 0) {
                    break;
                }
            }
        }
    }

    private List<ReturnOrdersResponseReturnOrders> getCancellableReturnOrdersForAnItem(ReturnExcessReqOrderLine returnEligibleLine,
                                                     Map<String, Object> contextMap) {
        ReturnOrdersResponse returnOrdersResponse = (ReturnOrdersResponse) contextMap.get("returnOrders");
        return returnOrdersResponse.getReturnOrders().stream()
                .filter(returnOrder -> isReturnContainsItem(returnEligibleLine, returnOrder) &&
                        canDeleteReturn(returnEligibleLine, returnOrder, contextMap))
                .collect(Collectors.toList());
    }

    private boolean canDeleteReturn(ReturnExcessReqOrderLine returnEligibleLine,
                                    ReturnOrdersResponseReturnOrders returnOrder, Map<String, ?> contextMap) {
        //TODO Check status?
        return (applicationConfig.getReturnOrderSourceType().contains(returnOrder.getSource())
                && "N".equalsIgnoreCase(returnOrder.getRefundInitiatedFlag())
                && !returnOrder.getCustomerReturnOrderId().equals(contextMap.get("customerReturnOrderId").toString()));
    }

    private boolean isReturnContainsItem(ReturnExcessReqOrderLine returnEligibleLine,
                                         ReturnOrdersResponseReturnOrders returnOrder) {
        return returnOrder.getOrderLines().stream()
                .filter(returnLine -> returnLine.getItemId().equals(returnEligibleLine.getItemId())).count() > 0;
    }

    private Mono<ReturnOrdersResponse> getReturnOrdersForCustomerSalesOrder(Map<String, Object> contextMap) {
        return orderService.getReturnOrders(
                contextMap.get("customerOrderId").toString(), contextMap.get("enterpriseCode").toString());
    }


    private Map<String, BigDecimal> getReturnableQtyByItemId(List<ReturnExcessReqOrderLine> eligibleReturnLines,
                                                             Map<String, Object> contextMap) {

        Map<String, CustomerOrderDetailsResponseOrderLines> itemIdToCustomerOrderLine =
                (Map<String, CustomerOrderDetailsResponseOrderLines>) contextMap.get("itemIdToCustomerOrderLineMap");
        Map<String, BigDecimal> itemIdToReturnableQty = new HashMap<>();
        eligibleReturnLines.stream()
                .forEach(returnEligibleLine -> {
                    String itemId = returnEligibleLine.getItemId();
                    if (itemIdToReturnableQty.containsKey(itemId)) {
                        itemIdToReturnableQty.put(itemId,
                                itemIdToReturnableQty.get(itemId).add(itemIdToCustomerOrderLine.get(itemId).getReturnableQuantity()));
                    } else {
                        itemIdToReturnableQty.put(itemId, itemIdToCustomerOrderLine.get(itemId).getReturnableQuantity());
                    }
                });
        contextMap.put("itemIdToReturnableQty", itemIdToReturnableQty);
        return itemIdToReturnableQty;
    }

    private void processNonEligibleReturnLines(List<ReturnExcessReqOrderLine> nonEligibleReturnLines,
                                              Map<String, Object> contextMap) {
        if(CollectionUtils.isNotEmpty(nonEligibleReturnLines)) {
            UpdateReturnOrderReq updateReturnOrderReq = RequestMapper.convertToUpdateReturnOrderReq(nonEligibleReturnLines, contextMap);
            orderService.updateReturnOrderWithNonEligibleLines(contextMap.get("customerReturnOrderId").toString(), updateReturnOrderReq);
        }
    }

    public static List<ReturnExcessReqOrderLine> getEligibleReturnLines(final ReturnExceptionReq request,
                                                                        final Map<String, Object> contextMap) {

        /**
         * Return eligible lines i.e lines having ExcessQty > 0 && itemOnCustomerOrder = Y && lmgItem = Y && returnable = Y
         */
        Map<String, CustomerOrderDetailsResponseOrderLines> itemIdToCustomerOrderLine =
                (Map<String, CustomerOrderDetailsResponseOrderLines>) contextMap.get("itemIdToCustomerOrderLineMap");
        List<ReturnExcessReqOrderLine> eligibleReturnLines = request.getOrderLines()
                .parallelStream()
                .filter(orderLine -> orderLine.getExcessQuantity().compareTo(BigDecimal.ZERO) > 0 &&
                        "Y".equalsIgnoreCase(orderLine.getLmgItem()) &&
                        "Y".equalsIgnoreCase(orderLine.getItemOnCustomerOrder()) &&
                        "Y".equalsIgnoreCase(itemIdToCustomerOrderLine.get(
                                orderLine.getItemId()).getIsReturnable()))
                .collect(Collectors.toList());
        return eligibleReturnLines;
    }



}
