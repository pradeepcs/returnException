package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/

public class ReturnRefundEnquiryReq  {
  

  private String customerOrderId = null;


  private String enterpriseCode = null;


  private String isGuestUser = null;


  private String deliveryType = null;


  private String source = null;


  private String isRefundOptionRequired = null;


  private String isIebRequired = null;


  private List<ReturnRefundEnquiryReqOrderLines> orderLines = null;
 /**
   * Get customerOrderId
   * @return customerOrderId
  **/
  @JsonProperty("customer_order_id")
  public String getCustomerOrderId() {
    return customerOrderId;
  }

  public void setCustomerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
  }

  public ReturnRefundEnquiryReq customerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
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

  public ReturnRefundEnquiryReq enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get isGuestUser
   * @return isGuestUser
  **/
  @JsonProperty("is_guest_user")
  public String getIsGuestUser() {
    return isGuestUser;
  }

  public void setIsGuestUser(String isGuestUser) {
    this.isGuestUser = isGuestUser;
  }

  public ReturnRefundEnquiryReq isGuestUser(String isGuestUser) {
    this.isGuestUser = isGuestUser;
    return this;
  }

 /**
   * Get deliveryType
   * @return deliveryType
  **/
  @JsonProperty("delivery_type")
  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public ReturnRefundEnquiryReq deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
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

  public ReturnRefundEnquiryReq source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get isRefundOptionRequired
   * @return isRefundOptionRequired
  **/
  @JsonProperty("is_refund_option_required")
  public String getIsRefundOptionRequired() {
    return isRefundOptionRequired;
  }

  public void setIsRefundOptionRequired(String isRefundOptionRequired) {
    this.isRefundOptionRequired = isRefundOptionRequired;
  }

  public ReturnRefundEnquiryReq isRefundOptionRequired(String isRefundOptionRequired) {
    this.isRefundOptionRequired = isRefundOptionRequired;
    return this;
  }

 /**
   * Get isIebRequired
   * @return isIebRequired
  **/
  @JsonProperty("is_ieb_required")
  public String getIsIebRequired() {
    return isIebRequired;
  }

  public void setIsIebRequired(String isIebRequired) {
    this.isIebRequired = isIebRequired;
  }

  public ReturnRefundEnquiryReq isIebRequired(String isIebRequired) {
    this.isIebRequired = isIebRequired;
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

  public ReturnRefundEnquiryReq orderLines(List<ReturnRefundEnquiryReqOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public ReturnRefundEnquiryReq addOrderLinesItem(ReturnRefundEnquiryReqOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRefundEnquiryReq {\n");
    
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    isGuestUser: ").append(toIndentedString(isGuestUser)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    isRefundOptionRequired: ").append(toIndentedString(isRefundOptionRequired)).append("\n");
    sb.append("    isIebRequired: ").append(toIndentedString(isIebRequired)).append("\n");
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

