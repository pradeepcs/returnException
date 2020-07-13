package com.lmg.returns.exception.util;

import com.lmg.returns.exception.model.order.returns.*;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponseOrderLines;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RequestMapper {

    public static CreateReturnsReq convertToCreateReturnsReq(ReturnRefundEnquiryResp returnRefundEnquiryResp,
                                                             Map<String, Object> contextMap) {

        CustomerOrderDetailsResponse customerOrder = (CustomerOrderDetailsResponse) contextMap.get("customerOrder");
        Map<String, CustomerOrderDetailsResponseOrderLines> itemIdToCustomerOrderLine =
                (Map<String, CustomerOrderDetailsResponseOrderLines>) contextMap.get("itemIdToCustomerOrderLineMap");
        CreateReturnsReq createReturnsReq = new CreateReturnsReq();

//      createReturnsReq.setAdditionalAddress(additionalAddress);
//      createReturnsReq.setCarrierCode(carrierCode);
//      createReturnsReq.setCashierIdentifier(cashierIdentifier);
//      createReturnsReq.setCashierName(cashierName);
//      createReturnsReq.setComment(comment);
        createReturnsReq.setCustomerOrderId(returnRefundEnquiryResp.getCustomerOrderId());
        createReturnsReq.setDeliveryType(customerOrder.getOrderLines()
                .get(0)
                .getDeliveryType());
        createReturnsReq.setEnterpriseCode(returnRefundEnquiryResp.getEnterpriseCode());
        createReturnsReq.setIsGuestUser(customerOrder.getIsGuestUser());

//      createReturnsReq.setPickupAddress(pickupAddress);
//      createReturnsReq.setPickupDate();
//      createReturnsReq.setPickupSlot(pickupSlot);
//      createReturnsReq.setRdoNumber(rdoNumber);
//      createReturnsReq.setReason(reason);
        createReturnsReq.setRefundOptions(returnRefundEnquiryResp.getRefundOptions());
//        createReturnsReq.setShipNode();
        createReturnsReq.setSource(returnRefundEnquiryResp.getSource());
//      createReturnsReq.setStoreNumber(storeNumber);
//      createReturnsReq.setTerritoryCode(territoryCode);
//      createReturnsReq.setTrackingNumber(trackingNumber);

        List<CreateReturnsReqOrderLines> orderLines = new ArrayList<CreateReturnsReqOrderLines>();
        returnRefundEnquiryResp.getOrderLines().parallelStream().forEach(returnLine -> {
            CreateReturnsReqOrderLines orderLine = new CreateReturnsReqOrderLines();
            orderLine.setDepartmentCode(returnLine.getDepartmentCode());
            orderLine.setDiscountedUnitPrice(returnLine.getDiscountedUnitPrice());
            orderLine.setItemDescription(returnLine.getItemDescription());
            orderLine.setItemId(returnLine.getItemId());
            orderLine.setItemTax(returnLine.getItemTax());
            orderLine.setOrderedQuantity(returnLine.getItemTax());
            orderLine.setPrimeLineNumber(itemIdToCustomerOrderLine
                    .get(returnLine.getItemId())
                    .getPrimeLineNumber()
            );
            //orderLine.setReturnComment(returnComment);
            orderLine.setReturnQuantity(returnLine.getReturnQuantity());
            //orderLine.setReturnReason(returnLine.get);
            //orderLine.setUnitOfMeasure(unitOfMeasure);
            orderLine.setUnitPrice(returnLine.getUnitPrice());
            orderLines.add(orderLine);
        });
        createReturnsReq.setOrderLines(orderLines);
        return createReturnsReq;
    }


    public static UpdateReturnOrderReq convertToUpdateReturnOrderReq(
            List<ReturnExcessReqOrderLine> returnNonEligibleLines, Map<String, Object> contextMap) {

        CustomerOrderDetailsResponse customerOrder = (CustomerOrderDetailsResponse) contextMap.get("customerOrder");
        Map<String, CustomerOrderDetailsResponseOrderLines> itemIdToCustomerOrderLine =
                (Map<String, CustomerOrderDetailsResponseOrderLines>) contextMap.get("itemIdToCustomerOrderLineMap");
        UpdateReturnOrderReq updateReturnOrderReq = new UpdateReturnOrderReq();

        List<UpdateReturnOrderReqOrderLines> UpdateReturnOrderReqOrderLines = new ArrayList<>();
        UpdateReturnOrderReqOrderLines updateReturnOrderReqOrderLine = new UpdateReturnOrderReqOrderLines();

        returnNonEligibleLines.parallelStream().forEach(returnNonEligibleLine -> {
            updateReturnOrderReqOrderLine.setItemId(returnNonEligibleLine.getItemId());
            updateReturnOrderReqOrderLine.setDispositionCode(returnNonEligibleLine.getDispositionCode());
            updateReturnOrderReqOrderLine.setExcessQuantity(returnNonEligibleLine.getExcessQuantity());
            updateReturnOrderReqOrderLine.setIsItemOnCustomerOrder(returnNonEligibleLine.getItemOnCustomerOrder());
            updateReturnOrderReqOrderLine.setIsLmgItem(returnNonEligibleLine.getLmgItem());
            updateReturnOrderReqOrderLine.setCustomerOrderId(customerOrder.getCustomerOrderId());
            updateReturnOrderReqOrderLine.setPrimeLineNumber(itemIdToCustomerOrderLine
                    .get(returnNonEligibleLine.getItemId())
                    .getPrimeLineNumber());
            UpdateReturnOrderReqOrderLines.add(updateReturnOrderReqOrderLine);
        });

        updateReturnOrderReq.setEnterpriseCode(customerOrder.getEnterpriseCode());
        updateReturnOrderReq.setOrderLines(UpdateReturnOrderReqOrderLines);
        return updateReturnOrderReq;
    }


}
