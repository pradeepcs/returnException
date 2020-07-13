package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/

public class ReturnPolicyEnquiryResp  {
  

  private String customerOrderId = null;


  private String enterpriseCode = null;


  private String status = null;


  private String isLegacyOrder = null;


  private String isManagerOverride = null;


  private List<ReturnPolicyEnquiryRespOrderLines> orderLines = null;
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

  public ReturnPolicyEnquiryResp customerOrderId(String customerOrderId) {
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

  public ReturnPolicyEnquiryResp enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

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

  public ReturnPolicyEnquiryResp status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get isLegacyOrder
   * @return isLegacyOrder
  **/
  @JsonProperty("is_legacy_order")
  public String getIsLegacyOrder() {
    return isLegacyOrder;
  }

  public void setIsLegacyOrder(String isLegacyOrder) {
    this.isLegacyOrder = isLegacyOrder;
  }

  public ReturnPolicyEnquiryResp isLegacyOrder(String isLegacyOrder) {
    this.isLegacyOrder = isLegacyOrder;
    return this;
  }

 /**
   * Get isManagerOverride
   * @return isManagerOverride
  **/
  @JsonProperty("is_manager_override")
  public String getIsManagerOverride() {
    return isManagerOverride;
  }

  public void setIsManagerOverride(String isManagerOverride) {
    this.isManagerOverride = isManagerOverride;
  }

  public ReturnPolicyEnquiryResp isManagerOverride(String isManagerOverride) {
    this.isManagerOverride = isManagerOverride;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<ReturnPolicyEnquiryRespOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<ReturnPolicyEnquiryRespOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public ReturnPolicyEnquiryResp orderLines(List<ReturnPolicyEnquiryRespOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public ReturnPolicyEnquiryResp addOrderLinesItem(ReturnPolicyEnquiryRespOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicyEnquiryResp {\n");
    
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isLegacyOrder: ").append(toIndentedString(isLegacyOrder)).append("\n");
    sb.append("    isManagerOverride: ").append(toIndentedString(isManagerOverride)).append("\n");
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

