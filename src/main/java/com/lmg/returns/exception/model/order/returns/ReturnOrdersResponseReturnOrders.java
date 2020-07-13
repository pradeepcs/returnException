package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReturnOrdersResponseReturnOrders  {
  

  private String customerReturnOrderId = null;


  private String enterpriseCode = null;


  private String source = null;


  private String returnOrderStatus = null;


  private String returnOrderDate = null;


  private String refundInitiatedFlag = null;


  private List<ReturnRefundEnquiryReqOrderLines> orderLines = null;
 /**
   * Get customerReturnOrderId
   * @return customerReturnOrderId
  **/
  @JsonProperty("customer_return_order_id")
  public String getCustomerReturnOrderId() {
    return customerReturnOrderId;
  }

  public void setCustomerReturnOrderId(String customerReturnOrderId) {
    this.customerReturnOrderId = customerReturnOrderId;
  }

  public ReturnOrdersResponseReturnOrders customerReturnOrderId(String customerReturnOrderId) {
    this.customerReturnOrderId = customerReturnOrderId;
    return this;
  }

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

  public ReturnOrdersResponseReturnOrders enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ReturnOrdersResponseReturnOrders source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get returnOrderStatus
   * @return returnOrderStatus
  **/
  @JsonProperty("return_order_status")
  public String getReturnOrderStatus() {
    return returnOrderStatus;
  }

  public void setReturnOrderStatus(String returnOrderStatus) {
    this.returnOrderStatus = returnOrderStatus;
  }

  public ReturnOrdersResponseReturnOrders returnOrderStatus(String returnOrderStatus) {
    this.returnOrderStatus = returnOrderStatus;
    return this;
  }

 /**
   * Get returnOrderDate
   * @return returnOrderDate
  **/
  @JsonProperty("return_order_date")
  public String getReturnOrderDate() {
    return returnOrderDate;
  }

  public void setReturnOrderDate(String returnOrderDate) {
    this.returnOrderDate = returnOrderDate;
  }

  public ReturnOrdersResponseReturnOrders returnOrderDate(String returnOrderDate) {
    this.returnOrderDate = returnOrderDate;
    return this;
  }

 /**
   * Get refundInitiatedFlag
   * @return refundInitiatedFlag
  **/
  @JsonProperty("refund_initiated_flag")
  public String getRefundInitiatedFlag() {
    return refundInitiatedFlag;
  }

  public void setRefundInitiatedFlag(String refundInitiatedFlag) {
    this.refundInitiatedFlag = refundInitiatedFlag;
  }

  public ReturnOrdersResponseReturnOrders refundInitiatedFlag(String refundInitiatedFlag) {
    this.refundInitiatedFlag = refundInitiatedFlag;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<ReturnRefundEnquiryReqOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<ReturnRefundEnquiryReqOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public ReturnOrdersResponseReturnOrders orderLines(List<ReturnRefundEnquiryReqOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public ReturnOrdersResponseReturnOrders addOrderLinesItem(ReturnRefundEnquiryReqOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnOrdersResponseReturnOrders {\n");
    
    sb.append("    customerReturnOrderId: ").append(toIndentedString(customerReturnOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    returnOrderStatus: ").append(toIndentedString(returnOrderStatus)).append("\n");
    sb.append("    returnOrderDate: ").append(toIndentedString(returnOrderDate)).append("\n");
    sb.append("    refundInitiatedFlag: ").append(toIndentedString(refundInitiatedFlag)).append("\n");
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

