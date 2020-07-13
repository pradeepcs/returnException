package com.lmg.returns.exception.service;

import com.lmg.returns.exception.model.order.returns.CreateReturnsReq;
import com.lmg.returns.exception.model.order.returns.ReturnOrdersResponse;
import com.lmg.returns.exception.model.order.returns.UpdateReturnOrderReq;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service("orderService")
public class OrderService {

    public Mono<CustomerOrderDetailsResponse> getsCustomerOrder(String customerOrderId, String enterpriseCode) {
        return WebClient.create("http://localhost:8080")
                .get()
                .uri("/v1/test/customerOrder")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(CustomerOrderDetailsResponse.class));
    }

    public Mono<ReturnOrdersResponse> getReturnOrders(String customerOrderId, String enterpriseCode) {
        return WebClient.create("http://localhost:8080")
                .get()
                .uri("/v1/test/returnOrders")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(ReturnOrdersResponse.class));
    }

    public void deleteReturnOrder(String returnOrderId, String enterpriseCode) {
        WebClient.create("http://localhost:8080")
                .delete()
                .uri("")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();
    }


    public Mono<Void> createReturnOrders(CreateReturnsReq createReturnsReq) {
        WebClient.create("http://localhost:8080")
                .post()
                .uri("/v1/test/returnOrder")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(createReturnsReq), CreateReturnsReq.class)
                .exchange().subscribe();
        return Mono.empty();
    }

    public void updateReturnOrderWithNonEligibleLines(UpdateReturnOrderReq updateReturnOrderReq) {
        WebClient.create("http://localhost:8080")
                .post()
                .uri("")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(updateReturnOrderReq), UpdateReturnOrderReq.class)
                .exchange();
    }
}