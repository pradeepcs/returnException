package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/
public class ReturnOrdersResponse  {
  

  private List<ReturnOrdersResponseReturnOrders> returnOrders = null;
 /**
   * Get returnOrders
   * @return returnOrders
  **/
  @JsonProperty("return_orders")
  public List<ReturnOrdersResponseReturnOrders> getReturnOrders() {
    return returnOrders;
  }

  public void setReturnOrders(List<ReturnOrdersResponseReturnOrders> returnOrders) {
    this.returnOrders = returnOrders;
  }

  public ReturnOrdersResponse returnOrders(List<ReturnOrdersResponseReturnOrders> returnOrders) {
    this.returnOrders = returnOrders;
    return this;
  }

  public ReturnOrdersResponse addReturnOrdersItem(ReturnOrdersResponseReturnOrders returnOrdersItem) {
    this.returnOrders.add(returnOrdersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnOrdersResponse {\n");
    
    sb.append("    returnOrders: ").append(toIndentedString(returnOrders)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

