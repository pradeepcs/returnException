package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
  * 
 **/

public class ReturnRefundEnquiryResp  {
  

  private String customerOrderId = null;


  private String enterpriseCode = null;


  private String status = null;


  private String source = null;


  private BigDecimal totalRefundOption = null;


  private List<ReturnRefundEnquiryRespRefundOptions> refundOptions = null;


  private List<ReturnRefundEnquiryRespOrderLines> orderLines = null;
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

  public ReturnRefundEnquiryResp customerOrderId(String customerOrderId) {
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

  public ReturnRefundEnquiryResp enterpriseCode(String enterpriseCode) {
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

  public ReturnRefundEnquiryResp status(String status) {
    this.status = status;
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

  public ReturnRefundEnquiryResp source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get totalRefundOption
   * @return totalRefundOption
  **/
  @JsonProperty("total_refund_option")
  public BigDecimal getTotalRefundOption() {
    return totalRefundOption;
  }

  public void setTotalRefundOption(BigDecimal totalRefundOption) {
    this.totalRefundOption = totalRefundOption;
  }

  public ReturnRefundEnquiryResp totalRefundOption(BigDecimal totalRefundOption) {
    this.totalRefundOption = totalRefundOption;
    return this;
  }

 /**
   * Get refundOptions
   * @return refundOptions
  **/
  @JsonProperty("refund_options")
  public List<ReturnRefundEnquiryRespRefundOptions> getRefundOptions() {
    return refundOptions;
  }

  public void setRefundOptions(List<ReturnRefundEnquiryRespRefundOptions> refundOptions) {
    this.refundOptions = refundOptions;
  }

  public ReturnRefundEnquiryResp refundOptions(List<ReturnRefundEnquiryRespRefundOptions> refundOptions) {
    this.refundOptions = refundOptions;
    return this;
  }

  public ReturnRefundEnquiryResp addRefundOptionsItem(ReturnRefundEnquiryRespRefundOptions refundOptionsItem) {
    this.refundOptions.add(refundOptionsItem);
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<ReturnRefundEnquiryRespOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<ReturnRefundEnquiryRespOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public ReturnRefundEnquiryResp orderLines(List<ReturnRefundEnquiryRespOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public ReturnRefundEnquiryResp addOrderLinesItem(ReturnRefundEnquiryRespOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRefundEnquiryResp {\n");
    
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    totalRefundOption: ").append(toIndentedString(totalRefundOption)).append("\n");
    sb.append("    refundOptions: ").append(toIndentedString(refundOptions)).append("\n");
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

