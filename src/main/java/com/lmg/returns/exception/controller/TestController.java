package com.lmg.returns.exception.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lmg.returns.exception.model.order.returns.*;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Map;


@RequestMapping("/v1/test")
@RestController
public class TestController {

    @GetMapping("/customerOrder")
    public Mono<CustomerOrderDetailsResponse> getCustomer() throws IOException {
        CustomerOrderDetailsResponse customerOrder = new ObjectMapper()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .readValue(testCustomerOrder, CustomerOrderDetailsResponse.class);
        return Mono.just(customerOrder);
    }


    String testCustomerOrder = "{\n" +
            "  \"customer_order_id\": \"Y100000635\",\n" +
            "  \"enterprise_code\": \"LMG_UAE\",\n" +
            "  \"order_date\": \"\",\n" +
            "  \"document_type\": \"\",\n" +
            "  \"is_guest_user\": \"\",\n" +
            "  \"shukran_loyalty_card_no\": \"\",\n" +
            "  \"order_lines\": [\n" +
            "    {\n" +
            "      \"ordered_quantity\": 6,\n" +
            "      \"department_code\": \"\",\n" +
            "      \"prime_line_number\": 1,\n" +
            "      \"returnable_quantity\": 3,\n" +
            "      \"delivery_date\": \"\",\n" +
            "      \"delivery_type\": \"\",\n" +
            "      \"is_returnable\": \"Y\",\n" +
            "      \"item_type\": \"\",\n" +
            "      \"line_charges\": [\n" +
            "        {\n" +
            "          \"charge_category\": \"\",\n" +
            "          \"charge_name\": \"\",\n" +
            "          \"charge_per_unit\": 4\n" +
            "        }\n" +
            "      ],\n" +
            "      \"line_price_information\": {\n" +
            "        \"is_price_locked\": \"\",\n" +
            "        \"refund_price\": 1,\n" +
            "        \"unit_price\": 1\n" +
            "      },\n" +
            "      \"item_details\": {\n" +
            "        \"item_id\": \"LMG1\",\n" +
            "        \"unit_of_measure\": \"\",\n" +
            "        \"description\": \"\",\n" +
            "        \"product_line\": \"\"\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"ordered_quantity\": 10,\n" +
            "      \"department_code\": \"\",\n" +
            "      \"prime_line_number\": 2,\n" +
            "      \"returnable_quantity\": 5,\n" +
            "      \"delivery_date\": \"\",\n" +
            "      \"delivery_type\": \"\",\n" +
            "      \"is_returnable\": \"Y\",\n" +
            "      \"item_type\": \"\",\n" +
            "      \"line_charges\": [\n" +
            "        {\n" +
            "          \"charge_category\": \"\",\n" +
            "          \"charge_name\": \"\",\n" +
            "          \"charge_per_unit\": 4\n" +
            "        }\n" +
            "      ],\n" +
            "      \"line_price_information\": {\n" +
            "        \"is_price_locked\": \"\",\n" +
            "        \"refund_price\": 1,\n" +
            "        \"unit_price\": 1\n" +
            "      },\n" +
            "      \"item_details\": {\n" +
            "        \"item_id\": \"LMG2\",\n" +
            "        \"unit_of_measure\": \"\",\n" +
            "        \"description\": \"\",\n" +
            "        \"product_line\": \"\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"header_charges\": [\n" +
            "    {\n" +
            "      \"charge_amount\": 30,\n" +
            "      \"charge_category\": \"\",\n" +
            "      \"charge_name\": \"\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"payment_methods\": [\n" +
            "    {\n" +
            "      \"payment_type\": \"CREDIT_CARD\",\n" +
            "      \"amount\": 20,\n" +
            "      \"payment_code\": \"CCARD\",\n" +
            "      \"voucher_code\": \"\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    @GetMapping("/returnOrders")
    public Mono<ReturnOrdersResponse> getReturnOrders() throws IOException {
        ReturnOrdersResponse returnOrders = new ObjectMapper().readValue(returnOrdersStr, ReturnOrdersResponse.class);
        return Mono.just(returnOrders);
    }


    String returnOrdersStr = "{\n" +
            "  \"return_orders\": [\n" +
            "    {\n" +
            "      \"customer_return_order_id\": \"Y100000651\",\n" +
            "      \"enterprise_code\": \"LMG_UAE\",\n" +
            "      \"source\": \"ONLINE\",\n" +
            "      \"return_order_status\": \"Return Created\",\n" +
            "      \"return_order_date\": \"\",\n" +
            "      \"refund_initiated_flag\": \"N\",\n" +
            "      \"order_lines\": [\n" +
            "        {\n" +
            "          \"item_id\": \"LMG1\",\n" +
            "          \"return_quantity\": 3\n" +
            "        },\n" +
            "        {\n" +
            "          \"item_id\": \"LMG2\",\n" +
            "          \"return_quantity\": 5\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"customer_return_order_id\": \"Y100000655\",\n" +
            "      \"enterprise_code\": \"LMG_UAE\",\n" +
            "      \"source\": \"ONLINE\",\n" +
            "      \"return_order_status\": \"Return Created\",\n" +
            "      \"return_order_date\": \"\",\n" +
            "      \"refund_initiated_flag\": \"N\",\n" +
            "      \"order_lines\": [\n" +
            "        {\n" +
            "          \"item_id\": \"LMG1\",\n" +
            "          \"return_quantity\": 3\n" +
            "        },\n" +
            "        {\n" +
            "          \"item_id\": \"LMG2\",\n" +
            "          \"return_quantity\": 5\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    @PostMapping("/refund")
    public Mono<ReturnRefundEnquiryResp> getReturnRefund() throws IOException {
        ReturnRefundEnquiryResp returnRefund = new ObjectMapper().readValue(returnRefundStr, ReturnRefundEnquiryResp.class);
        return Mono.just(returnRefund);
    }


    String returnRefundStr = "{\n" +
            "  \"customer_order_id\": \"Y100000635\",\n" +
            "  \"enterprise_code\": \"LMG_UAE\",\n" +
            "  \"status\": \"Success\",\n" +
            "  \"source\": \"G\",\n" +
            "  \"total_refund_option\": 1,\n" +
            "  \"refund_options\": [\n" +
            "    {\n" +
            "      \"mode\": \"CREDIT_CARD\",\n" +
            "      \"cash_refund\": \"N\",\n" +
            "      \"total_loyalty_refund_amount\": 5,\n" +
            "      \"non_refunded_voucher_amount\": 0,\n" +
            "      \"delivery_cost\": 15,\n" +
            "      \"payment_cost\": 0,\n" +
            "      \"loyalty_recovery_amount\": 0,\n" +
            "      \"payment_methods\": [\n" +
            "        {\n" +
            "          \"payment_type\": \"CREDIT_CARD\",\n" +
            "          \"payment_code\": \"CCRD\",\n" +
            "          \"amount\": 20,\n" +
            "          \"voucher_code\": \"\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"order_lines\": [\n" +
            "    {\n" +
            "      \"item_id\": \"LMG1\",\n" +
            "      \"item_description\": \"Men Shirt\",\n" +
            "      \"unit_price\": 20.8,\n" +
            "      \"discounted_unit_price\": 20.8,\n" +
            "      \"return_quantity\": 3,\n" +
            "      \"ordered_quantity\": 6,\n" +
            "      \"item_tax\": 1.0,\n" +
            "      \"department_code\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"item_id\": \"LMG2\",\n" +
            "      \"item_description\": \"Men Shirt\",\n" +
            "      \"unit_price\": 20.8,\n" +
            "      \"discounted_unit_price\": 20.8,\n" +
            "      \"return_quantity\": 5,\n" +
            "      \"ordered_quantity\": 10,\n" +
            "      \"item_tax\": 1.0,\n" +
            "      \"department_code\": \"\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";



    @PostMapping("/returnOrder")
    public Mono<Void> createOrder(@RequestBody CreateReturnsReq createReturnsReq) throws IOException {
        System.out.println(createReturnsReq);
        return Mono.empty();
    }

    @DeleteMapping("/returnOrder")
    public Mono<Void> deleteOrder(@PathVariable String returnOrderId, @RequestHeader Map<String, String> headers) throws IOException {
        System.out.println("returnOrderId " + returnOrderId);
        System.out.println("headers " + headers);
        return Mono.empty();
    }

    @PatchMapping("/returnOrder")
    public Mono<Void> patchReturnOrder(@RequestBody UpdateReturnOrderReq updateReturnOrderReq) throws IOException {
        System.out.println("updateReturnOrderReq " + updateReturnOrderReq);
        return Mono.empty();
    }

}
