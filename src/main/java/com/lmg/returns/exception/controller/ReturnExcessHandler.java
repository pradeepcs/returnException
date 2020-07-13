package com.lmg.returns.exception.controller;

import com.lmg.returns.exception.model.order.returns.ReturnExceptionReq;
import com.lmg.returns.exception.service.ReturnExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

//@Component
public class ReturnExcessHandler {

    @Autowired
    ReturnExceptionService returnExceptionService;

    public Mono<ServerResponse> processExcessReturn(ServerRequest request) {
        returnExceptionService.processReturnException(request.bodyToMono(ReturnExceptionReq.class).toProcessor().peek());
        return (Mono<ServerResponse>) ServerResponse.ok();
    }
}
