package com.lmg.returns.exception.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmg.returns.exception.model.order.returns.ReturnExceptionReq;
import com.lmg.returns.exception.model.order.returns.ReturnOrdersResponse;
import com.lmg.returns.exception.model.order.returns.ReturnRefundEnquiryReq;
import com.lmg.returns.exception.model.order.returns.ReturnRefundEnquiryResp;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
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
        CustomerOrderDetailsResponse customerOrderDetailsResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_all_eligible.json").getFile(), CustomerOrderDetailsResponse.class);
        when(orderService.getsCustomerOrder("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrderDetailsResponse));

        ReturnRefundEnquiryResp returnRefundEnquiryResp = new ObjectMapper().readValue(
                new ClassPathResource("input/refund_enquiry_response_all_lines.json").getFile(), ReturnRefundEnquiryResp.class);
        when(returnRefundEnquiryService.getRefundDetails(argThat(new ArgumentMatcher<ReturnRefundEnquiryReq>() {
            @Override
            public boolean matches(ReturnRefundEnquiryReq returnRefundEnquiryReq) {
                return "Y100000635".equals(returnRefundEnquiryReq.getCustomerOrderId());
            }
        })))
                .thenReturn(Mono.just(returnRefundEnquiryResp));
        returnExceptionService.processReturnException(returnExceptionReq);
    }

    @Test
    public void processExcessReturnOneEligibleAndOneNonEligibleTest() throws IOException {
        ReturnExceptionReq returnExceptionReq = new ObjectMapper().readValue(
                new ClassPathResource("input/return_exception_one_eligible_one_non_eligible_req.json").getFile(), ReturnExceptionReq.class);
        CustomerOrderDetailsResponse customerOrderDetailsResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_one_eligible_one_noneligible.json").getFile(), CustomerOrderDetailsResponse.class);
        when(orderService.getsCustomerOrder("Y100000636", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrderDetailsResponse));

        ReturnRefundEnquiryResp returnRefundEnquiryResp = new ObjectMapper().readValue(
                new ClassPathResource("input/refund_enquiry_response_one_line.json").getFile(), ReturnRefundEnquiryResp.class);
        when(returnRefundEnquiryService.getRefundDetails(argThat(new ArgumentMatcher<ReturnRefundEnquiryReq>() {
            @Override
            public boolean matches(ReturnRefundEnquiryReq returnRefundEnquiryReq) {
                return "Y100000636".equals(returnRefundEnquiryReq.getCustomerOrderId());
            }
        })))
                .thenReturn(Mono.just(returnRefundEnquiryResp));
        returnExceptionService.processReturnException(returnExceptionReq);
    }

    @Test
    public void processExcessReturnAllEligibleWithDeleteExistingReturnOrderTest() throws IOException {
        ReturnExceptionReq returnExceptionReq = new ObjectMapper().readValue(
                new ClassPathResource("input/return_exception_all_eligible_req.json").getFile(), ReturnExceptionReq.class);
        CustomerOrderDetailsResponse customerOrderDetailsResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_all_lines_lesser_returnableQty.json").getFile(), CustomerOrderDetailsResponse.class);
        when(orderService.getsCustomerOrder("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrderDetailsResponse));

        ReturnOrdersResponse customerReturnOrders = new ObjectMapper().readValue(
                new ClassPathResource("input/two_return_orders.json").getFile(), ReturnOrdersResponse.class);
        when(orderService.getReturnOrders("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerReturnOrders));

        ReturnRefundEnquiryResp returnRefundEnquiryResp = new ObjectMapper().readValue(
                new ClassPathResource("input/refund_enquiry_response_one_line.json").getFile(), ReturnRefundEnquiryResp.class);
        when(returnRefundEnquiryService.getRefundDetails(argThat(new ArgumentMatcher<ReturnRefundEnquiryReq>() {
            @Override
            public boolean matches(ReturnRefundEnquiryReq returnRefundEnquiryReq) {
                return "Y100000635".equals(returnRefundEnquiryReq.getCustomerOrderId());
            }
        })))
                .thenReturn(Mono.just(returnRefundEnquiryResp));
        returnExceptionService.processReturnException(returnExceptionReq);
    }


    @Test
    public void processExcessReturnAllEligibleWithDeleteReturnOrderAndMuchHigherQtyTest() throws IOException {
        ReturnExceptionReq returnExceptionReq = new ObjectMapper().readValue(
                new ClassPathResource("input/return_exception_all_eligible_with_high_excess_qty_req.json").getFile(), ReturnExceptionReq.class);
        CustomerOrderDetailsResponse customerOrderDetailsResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_all_lines_lesser_returnableQty.json").getFile(), CustomerOrderDetailsResponse.class);
        when(orderService.getsCustomerOrder("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrderDetailsResponse));

        ReturnOrdersResponse customerReturnOrders = new ObjectMapper().readValue(
                new ClassPathResource("input/two_return_orders.json").getFile(), ReturnOrdersResponse.class);
        when(orderService.getReturnOrders("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerReturnOrders));

        ReturnRefundEnquiryResp returnRefundEnquiryResp = new ObjectMapper().readValue(
                new ClassPathResource("input/refund_enquiry_response_one_line.json").getFile(), ReturnRefundEnquiryResp.class);
        when(returnRefundEnquiryService.getRefundDetails(argThat(new ArgumentMatcher<ReturnRefundEnquiryReq>() {
            @Override
            public boolean matches(ReturnRefundEnquiryReq returnRefundEnquiryReq) {
                return "Y100000635".equals(returnRefundEnquiryReq.getCustomerOrderId());
            }
        })))
                .thenReturn(Mono.just(returnRefundEnquiryResp));
        returnExceptionService.processReturnException(returnExceptionReq);
    }

    @Test
    public void processNoEligibleLinesTest() throws IOException {
        ReturnExceptionReq returnExceptionReq = new ObjectMapper().readValue(
                new ClassPathResource("input/return_all_non_eligible_lines_req.json").getFile(), ReturnExceptionReq.class);
        CustomerOrderDetailsResponse customerOrderDetailsResponse = new ObjectMapper().readValue(
                new ClassPathResource("input/customer_order_all_lines_lesser_returnableQty.json").getFile(), CustomerOrderDetailsResponse.class);
        when(orderService.getsCustomerOrder("Y100000635", "LMG_UAE"))
                .thenReturn(Mono.just(customerOrderDetailsResponse));
        returnExceptionService.processReturnException(returnExceptionReq);
    }


}
