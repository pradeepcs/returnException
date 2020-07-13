package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/

public class ReturnPolicyEnquiryReq  {
  

  private String enterpriseCode = null;


  private String isManagerOverride = null;


  private String source = null;


  private List<ReturnPolicyEnquiryReqOrderLines> orderLines = null;
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

  public ReturnPolicyEnquiryReq enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
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

  public ReturnPolicyEnquiryReq isManagerOverride(String isManagerOverride) {
    this.isManagerOverride = isManagerOverride;
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

  public ReturnPolicyEnquiryReq source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<ReturnPolicyEnquiryReqOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<ReturnPolicyEnquiryReqOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public ReturnPolicyEnquiryReq orderLines(List<ReturnPolicyEnquiryReqOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public ReturnPolicyEnquiryReq addOrderLinesItem(ReturnPolicyEnquiryReqOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicyEnquiryReq {\n");
    
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    isManagerOverride: ").append(toIndentedString(isManagerOverride)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

