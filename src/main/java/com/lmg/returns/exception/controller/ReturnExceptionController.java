package com.lmg.returns.exception.controller;

import com.lmg.returns.exception.model.order.returns.ReturnExceptionReq;
import com.lmg.returns.exception.service.ReturnExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.Map;


@RequestMapping("/v3/customer-orders")
@RestController
public class ReturnExceptionController {

    @Autowired
    ReturnExceptionService returnExceptionService;

    @PostMapping("/{customerOrderId}/events/return-exception")
    public Mono<ServerResponse> processExcessReturn(@PathVariable String customerOrderId,
                                                    @Valid @RequestBody ReturnExceptionReq returnExceptionReq,
                                                    @RequestHeader Map<String, String> headers) {
        //TODO validate
        returnExceptionService.processReturnException(returnExceptionReq);
        return ServerResponse.ok().build();
    }
}
