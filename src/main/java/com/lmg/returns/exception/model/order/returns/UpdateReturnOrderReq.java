package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/

public class UpdateReturnOrderReq  {
  

  private String enterpriseCode = null;


  private List<UpdateReturnOrderReqOrderLines> orderLines = null;
 /**
   * Get enterpriseCode
   * @return enterpriseCode
  **/
  @JsonProperty("enterprise_code")
  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }

  public UpdateReturnOrderReq enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<UpdateReturnOrderReqOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<UpdateReturnOrderReqOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public UpdateReturnOrderReq orderLines(List<UpdateReturnOrderReqOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public UpdateReturnOrderReq addOrderLinesItem(UpdateReturnOrderReqOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReturnOrderReq {\n");
    
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
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

