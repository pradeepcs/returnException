package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/
public class CreateReturnsResp  {
  
  private String status = null;

  private String message = null;

  private String customerReturnOrderId = null;

  private String enterpriseCode = null;

  private String returnOrderDate = null;

  private List<CreateReturnsRespOrderLines> orderLines = null;

  private List<CreateReturnsRespRefundOptions> refundOptions = null;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CreateReturnsResp status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateReturnsResp message(String message) {
    this.message = message;
    return this;
  }

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

  public CreateReturnsResp customerReturnOrderId(String customerReturnOrderId) {
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

  public CreateReturnsResp enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
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

  public CreateReturnsResp returnOrderDate(String returnOrderDate) {
    this.returnOrderDate = returnOrderDate;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<CreateReturnsRespOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<CreateReturnsRespOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public CreateReturnsResp orderLines(List<CreateReturnsRespOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public CreateReturnsResp addOrderLinesItem(CreateReturnsRespOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }

 /**
   * Get refundOptions
   * @return refundOptions
  **/
  @JsonProperty("refund_options")
  public List<CreateReturnsRespRefundOptions> getRefundOptions() {
    return refundOptions;
  }

  public void setRefundOptions(List<CreateReturnsRespRefundOptions> refundOptions) {
    this.refundOptions = refundOptions;
  }

  public CreateReturnsResp refundOptions(List<CreateReturnsRespRefundOptions> refundOptions) {
    this.refundOptions = refundOptions;
    return this;
  }

  public CreateReturnsResp addRefundOptionsItem(CreateReturnsRespRefundOptions refundOptionsItem) {
    this.refundOptions.add(refundOptionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnsResp {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    customerReturnOrderId: ").append(toIndentedString(customerReturnOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    returnOrderDate: ").append(toIndentedString(returnOrderDate)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    refundOptions: ").append(toIndentedString(refundOptions)).append("\n");
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

