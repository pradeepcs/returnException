package com.lmg.returns.exception.util;

import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponse;
import com.lmg.returns.exception.model.order.sales.CustomerOrderDetailsResponseOrderLines;

import java.util.Map;
import java.util.stream.Collectors;

public class ReturnExceptionHelper {


    public static Map<String, CustomerOrderDetailsResponseOrderLines> getItemIdToOrderLineMap(Map<String, Object> contextMap) {
        CustomerOrderDetailsResponse customerOrder = (CustomerOrderDetailsResponse) contextMap.get("customerOrder");
        Map<String, CustomerOrderDetailsResponseOrderLines> itemIdToCustomerOrderLineMap = customerOrder.getOrderLines()
                .stream()
                .collect(Collectors.toMap(orderLine -> orderLine.getItemDetails().getItemId(), orderLine ->orderLine));
        return itemIdToCustomerOrderLineMap;
    }

}
