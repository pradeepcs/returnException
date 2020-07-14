package com.lmg.returns.exception.service;

import com.lmg.returns.exception.model.order.returns.*;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("returnRefundEnquiryService")
public class ReturnRefundEnquiryService {

    public Mono<ReturnRefundEnquiryResp> getRefundDetails(ReturnRefundEnquiryReq returnRefundEnquiryReq) {
        return WebClient.create("http://localhost:8080")
                .post()
                .uri("/v1/test/refund")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(returnRefundEnquiryReq), ReturnRefundEnquiryReq.class)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(ReturnRefundEnquiryResp.class));
    }

    public static ReturnRefundEnquiryReq convertToReturnRefundEnquiryReq(List<ReturnExcessReqOrderLine> returnEligibleLines,
                                                                   Map<String, Object> contextMap) {

        CustomerOrderDetailsResponse customerOrder = (CustomerOrderDetailsResponse) contextMap.get("customerOrder");
        ReturnRefundEnquiryReq refundEnquiryReq = new ReturnRefundEnquiryReq();
        List<ReturnRefundEnquiryReqOrderLines> orderLines = new ArrayList<>();

        returnEligibleLines.parallelStream().forEach(returnEligibleLine -> {
            ReturnRefundEnquiryReqOrderLines orderLine = new ReturnRefundEnquiryReqOrderLines();
            orderLine.setItemId(returnEligibleLine.getItemId());
            orderLine.setReturnQuantity(returnEligibleLine.getExcessQuantity());
            orderLines.add(orderLine);
        });

        refundEnquiryReq.setCustomerOrderId(customerOrder.getCustomerOrderId());
        refundEnquiryReq.setEnterpriseCode(customerOrder.getEnterpriseCode());
        refundEnquiryReq.setIsGuestUser(customerOrder.getIsGuestUser());
        refundEnquiryReq.setDeliveryType(customerOrder.getOrderLines()
                .get(0)
                .getDeliveryType());
        //refundEnquiryReq.setSource(customerOrder.get);
        //refundEnquiryReq.setIsRefundOptionRequired(isRefundOptionRequired);
        //refundEnquiryReq.setIsIebRequired(isIebRequired);
        refundEnquiryReq.setOrderLines(orderLines);
        return refundEnquiryReq;
    }


}