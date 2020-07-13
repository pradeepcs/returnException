package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * 
 **/

public class SearcReturnOrderReq  {
  

  private String customerReturnOrderId = null;


  private String enterpriseCode = null;


  private String trackingNumber = null;
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

  public SearcReturnOrderReq customerReturnOrderId(String customerReturnOrderId) {
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

  public SearcReturnOrderReq enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @JsonProperty("tracking_number")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public SearcReturnOrderReq trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearcReturnOrderReq {\n");
    
    sb.append("    customerReturnOrderId: ").append(toIndentedString(customerReturnOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
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

