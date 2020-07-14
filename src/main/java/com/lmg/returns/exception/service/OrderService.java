package com.lmg.returns.exception.service;

import com.lmg.returns.exception.model.order.returns.CreateReturnsReq;
import com.lmg.returns.exception.model.order.returns.ReturnOrdersResponse;
import com.lmg.returns.exception.model.order.returns.UpdateReturnOrderReq;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import com.lmg.returns.exception.util.ApplicationConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service("orderService")
public class OrderService {

    @Autowired
    ApplicationConfig applicationConfig;

    public Mono<CustomerOrderDetailsResponse> getCustomerOrder(String customerOrderId, String enterpriseCode) {
        return getWebClient()
                .get()
                .uri(StringUtils.replace(applicationConfig.getCustomerOrderURI(), "{customer-order-id}", customerOrderId))
                .header("enterprise_code", enterpriseCode)
                .header("x-ibm-client-id", applicationConfig.getAppClientId())
                .header("Authorization", "Bearer " + applicationConfig.getBearerToken())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(CustomerOrderDetailsResponse.class));
    }

    public Mono<ReturnOrdersResponse> getReturnOrders(String customerOrderId, String enterpriseCode) {
        return getWebClient()
                .get()
                .uri(StringUtils.replace(applicationConfig.getCustomerOrderForReturnURI(), "{customer-order-id}", customerOrderId))
                .header("enterprise_code", enterpriseCode)
                .header("x-ibm-client-id", applicationConfig.getAppClientId())
                .header("Authorization", "Bearer " + applicationConfig.getBearerToken())
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse ->  clientResponse.bodyToMono(ReturnOrdersResponse.class));
    }

    public void deleteReturnOrder(String returnOrderId, String enterpriseCode) {
        getWebClient()
                .delete()
                .uri(StringUtils.replace(applicationConfig.getCustomerReturnOrderURI(), "{customer-return-order-id}", returnOrderId))
                .accept(MediaType.APPLICATION_JSON)
                .header("enterprise_code", enterpriseCode)
                .header("x-ibm-client-id", applicationConfig.getAppClientId())
                .header("Authorization", "Bearer " + applicationConfig.getBearerToken())
                .exchange().subscribe();
    }


    public void createReturnOrders(CreateReturnsReq createReturnsReq) {
        getWebClient()
                .post()
                .uri(StringUtils.replace(applicationConfig.getCustomerOrderForReturnURI(), "{customer-order-id}", createReturnsReq.getCustomerOrderId()))
                .header("x-ibm-client-id", applicationConfig.getAppClientId())
                .header("Authorization", "Bearer " + applicationConfig.getBearerToken())
                .header("asynch_process_indicator", applicationConfig.getAsyncProcessIndicator())
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(createReturnsReq), CreateReturnsReq.class)
                .exchange().subscribe();
    }

    public void updateReturnOrderWithNonEligibleLines(String returnOrderId, UpdateReturnOrderReq updateReturnOrderReq) {
        getWebClient()
                .patch()
                .uri(StringUtils.replace(applicationConfig.getCustomerReturnOrderURI(), "{customer-return-order-id}",
                        returnOrderId))
                .header("x-ibm-client-id", applicationConfig.getAppClientId())
                .header("Authorization", "Bearer " + applicationConfig.getBearerToken())
                .header("asynch_process_indicator", applicationConfig.getAsyncProcessIndicator())
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(updateReturnOrderReq), UpdateReturnOrderReq.class)
                .exchange().subscribe();
    }


    private WebClient getWebClient() {
        return WebClient.create(applicationConfig.getBaseURL());
    }

}