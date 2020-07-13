package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class ReturnRefundEnquiryRespRefundOptions  {
  

  private String mode = null;


  private String cashRefund = null;


  private BigDecimal totalLoyaltyRefundAmount = null;


  private BigDecimal nonRefundedVoucherAmount = null;


  private BigDecimal deliveryCost = null;


  private BigDecimal paymentCost = null;


  private BigDecimal loyaltyRecoveryAmount = null;


  private List<ReturnRefundEnquiryRespPaymentMethods> paymentMethods = null;
 /**
   * Get mode
   * @return mode
  **/
  @JsonProperty("mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public ReturnRefundEnquiryRespRefundOptions mode(String mode) {
    this.mode = mode;
    return this;
  }

 /**
   * Get cashRefund
   * @return cashRefund
  **/
  @JsonProperty("cash_refund")
  public String getCashRefund() {
    return cashRefund;
  }

  public void setCashRefund(String cashRefund) {
    this.cashRefund = cashRefund;
  }

  public ReturnRefundEnquiryRespRefundOptions cashRefund(String cashRefund) {
    this.cashRefund = cashRefund;
    return this;
  }

 /**
   * Get totalLoyaltyRefundAmount
   * @return totalLoyaltyRefundAmount
  **/
  @JsonProperty("total_loyalty_refund_amount")
  public BigDecimal getTotalLoyaltyRefundAmount() {
    return totalLoyaltyRefundAmount;
  }

  public void setTotalLoyaltyRefundAmount(BigDecimal totalLoyaltyRefundAmount) {
    this.totalLoyaltyRefundAmount = totalLoyaltyRefundAmount;
  }

  public ReturnRefundEnquiryRespRefundOptions totalLoyaltyRefundAmount(BigDecimal totalLoyaltyRefundAmount) {
    this.totalLoyaltyRefundAmount = totalLoyaltyRefundAmount;
    return this;
  }

 /**
   * Get nonRefundedVoucherAmount
   * @return nonRefundedVoucherAmount
  **/
  @JsonProperty("non_refunded_voucher_amount")
  public BigDecimal getNonRefundedVoucherAmount() {
    return nonRefundedVoucherAmount;
  }

  public void setNonRefundedVoucherAmount(BigDecimal nonRefundedVoucherAmount) {
    this.nonRefundedVoucherAmount = nonRefundedVoucherAmount;
  }

  public ReturnRefundEnquiryRespRefundOptions nonRefundedVoucherAmount(BigDecimal nonRefundedVoucherAmount) {
    this.nonRefundedVoucherAmount = nonRefundedVoucherAmount;
    return this;
  }

 /**
   * Get deliveryCost
   * @return deliveryCost
  **/
  @JsonProperty("delivery_cost")
  public BigDecimal getDeliveryCost() {
    return deliveryCost;
  }

  public void setDeliveryCost(BigDecimal deliveryCost) {
    this.deliveryCost = deliveryCost;
  }

  public ReturnRefundEnquiryRespRefundOptions deliveryCost(BigDecimal deliveryCost) {
    this.deliveryCost = deliveryCost;
    return this;
  }

 /**
   * Get paymentCost
   * @return paymentCost
  **/
  @JsonProperty("payment_cost")
  public BigDecimal getPaymentCost() {
    return paymentCost;
  }

  public void setPaymentCost(BigDecimal paymentCost) {
    this.paymentCost = paymentCost;
  }

  public ReturnRefundEnquiryRespRefundOptions paymentCost(BigDecimal paymentCost) {
    this.paymentCost = paymentCost;
    return this;
  }

 /**
   * Get loyaltyRecoveryAmount
   * @return loyaltyRecoveryAmount
  **/
  @JsonProperty("loyalty_recovery_amount")
  public BigDecimal getLoyaltyRecoveryAmount() {
    return loyaltyRecoveryAmount;
  }

  public void setLoyaltyRecoveryAmount(BigDecimal loyaltyRecoveryAmount) {
    this.loyaltyRecoveryAmount = loyaltyRecoveryAmount;
  }

  public ReturnRefundEnquiryRespRefundOptions loyaltyRecoveryAmount(BigDecimal loyaltyRecoveryAmount) {
    this.loyaltyRecoveryAmount = loyaltyRecoveryAmount;
    return this;
  }

 /**
   * Get paymentMethods
   * @return paymentMethods
  **/
  @JsonProperty("payment_methods")
  public List<ReturnRefundEnquiryRespPaymentMethods> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<ReturnRefundEnquiryRespPaymentMethods> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public ReturnRefundEnquiryRespRefundOptions paymentMethods(List<ReturnRefundEnquiryRespPaymentMethods> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public ReturnRefundEnquiryRespRefundOptions addPaymentMethodsItem(ReturnRefundEnquiryRespPaymentMethods paymentMethodsItem) {
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRefundEnquiryRespRefundOptions {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    cashRefund: ").append(toIndentedString(cashRefund)).append("\n");
    sb.append("    totalLoyaltyRefundAmount: ").append(toIndentedString(totalLoyaltyRefundAmount)).append("\n");
    sb.append("    nonRefundedVoucherAmount: ").append(toIndentedString(nonRefundedVoucherAmount)).append("\n");
    sb.append("    deliveryCost: ").append(toIndentedString(deliveryCost)).append("\n");
    sb.append("    paymentCost: ").append(toIndentedString(paymentCost)).append("\n");
    sb.append("    loyaltyRecoveryAmount: ").append(toIndentedString(loyaltyRecoveryAmount)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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

