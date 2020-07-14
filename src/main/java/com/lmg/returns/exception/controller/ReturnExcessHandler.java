package com.lmg.returns.exception.controller;

import com.lmg.returns.exception.model.order.returns.ReturnExceptionReq;
import com.lmg.returns.exception.service.ReturnExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

//@Component
public class ReturnExcessHandler {

    @Autowired
    ReturnExceptionService returnExceptionService;

    public Mono<ServerResponse> processExcessReturn(ServerRequest request) {
        Mono<ReturnExceptionReq> returnExceptionReq = request.body(BodyExtractors.toMono(ReturnExceptionReq.class));
        returnExceptionReq.flatMap(returnExceptionReq1 -> {
            return returnExceptionService.processReturnException(returnExceptionReq1);
        });
        return (Mono<ServerResponse>) ServerResponse.ok();
    }
}
