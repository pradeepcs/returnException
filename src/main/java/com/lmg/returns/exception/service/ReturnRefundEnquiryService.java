package com.lmg.returns.exception.service;

import com.lmg.returns.exception.model.order.returns.*;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import com.lmg.returns.exception.util.ApplicationConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("returnRefundEnquiryService")
public class ReturnRefundEnquiryService {

    @Autowired
    ApplicationConfig applicationConfig;

    public Mono<ReturnRefundEnquiryResp> getRefundDetails(ReturnRefundEnquiryReq returnRefundEnquiryReq) {
        return WebClient.create(applicationConfig.getBaseURL())
                .post()
                .uri(StringUtils.replace(applicationConfig.getReturnRefundEnquiryURI(), "{customer-order-id}",
                        returnRefundEnquiryReq.getCustomerOrderId()))
                .header("x-ibm-client-id", applicationConfig.getAppClientId())
                .header("Authorization", "Bearer " + applicationConfig.getBearerToken())
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(returnRefundEnquiryReq), ReturnRefundEnquiryReq.class)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(ReturnRefundEnquiryResp.class));
    }
}