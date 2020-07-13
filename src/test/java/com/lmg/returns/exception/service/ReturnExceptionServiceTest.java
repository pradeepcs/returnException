package com.lmg.returns.exception.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmg.returns.exception.model.order.returns.*;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import com.lmg.returns.exception.util.ReturnExceptionHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.io.ClassPathResource;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ReturnExceptionServiceTest {

    @InjectMocks
    ReturnExceptionService returnExceptionService;

    @Mock
    OrderService orderService;

    @Mock
    ReturnRefundEnquiryService returnRefundEnquiryService;



    @Test
    public void processExcessReturnAllItemsTest() throws IOException {

        ReturnExceptionReq returnExceptionReq = new ObjectMapper().readValue(
                new ClassPathResource("input/return_exception_all_eligible_req.json").getFile(), ReturnExceptionReq.class);

        CustomerOrderDetailsResponse customerOrder = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_all_eligible.json").getFile(), CustomerOrderDetailsResponse.class);

        when(orderService.getsCustomerOrder("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrder));


        Map<String, Object> contextMap = new HashMap<>();
        contextMap.put("customerOrder", customerOrder);

        ReturnRefundEnquiryResp returnRefundResp = new ObjectMapper().readValue(
                new ClassPathResource("input/refund_enquiry_response_all_lines.json").getFile(), ReturnRefundEnquiryResp.class);

        ReturnExceptionHelper.getItemIdToOrderLineMap(contextMap);

        List<ReturnExcessReqOrderLine> returnEligibleLines = ReturnExceptionService.getEligibleReturnLines(returnExceptionReq, contextMap);

        ReturnRefundEnquiryReq returnRefundEnquiryReq = ReturnRefundEnquiryService.convertToReturnRefundEnquiryReq(returnEligibleLines, contextMap);

        when(returnRefundEnquiryService.getRefundDetails(returnRefundEnquiryReq))
                .thenReturn(Mono.just(returnRefundResp));


        Assert.assertEquals(returnExceptionReq, returnExceptionService.processReturnException(returnExceptionReq));
    }

    @Test
    public void processExcessReturnOneEligibleAndOneNonEligibleTest() throws IOException {
        ReturnExceptionReq returnExceptionReq = new ObjectMapper().readValue(
                new ClassPathResource("input/return_exception_all_eligible_req.json").getFile(), ReturnExceptionReq.class);

        CustomerOrderDetailsResponse customerOrderDetailsResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_all_eligible.json").getFile(), CustomerOrderDetailsResponse.class);

        ReturnOrdersResponse returnOrdersResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_return_order.json").getFile(), ReturnOrdersResponse.class);


        when(orderService.getsCustomerOrder("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrderDetailsResponse));

        when(orderService.getReturnOrders("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(returnOrdersResponse));

        Assert.assertEquals(returnExceptionReq, returnExceptionService.processReturnException(returnExceptionReq));
    }



}
