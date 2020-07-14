package com.lmg.returns.exception.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

//@Component
public class ReturnExcessRouter {
    @Bean
    public RouterFunction<ServerResponse> route(ReturnExcessHandler returnExcessHandler) {

        return RouterFunctions
                .route(RequestPredicates.POST("/v3/customer-orders/{customerOrderId}/events/return-exception")
                                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                returnExcessHandler::processExcessReturn);
    }
}
