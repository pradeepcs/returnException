package com.lmg.returns.exception.model.order.sales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsResponsePaymentMethods  {
  
  private String paymentType = null;

  private BigDecimal amount = null;

  private String paymentCode = null;

  private String voucherCode = null;
 /**
   * Get paymentType
   * @return paymentType
  **/
  @JsonProperty("payment_type")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public CustomerOrderDetailsResponsePaymentMethods paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CustomerOrderDetailsResponsePaymentMethods amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get paymentCode
   * @return paymentCode
  **/
  @JsonProperty("payment_code")
  public String getPaymentCode() {
    return paymentCode;
  }

  public void setPaymentCode(String paymentCode) {
    this.paymentCode = paymentCode;
  }

  public CustomerOrderDetailsResponsePaymentMethods paymentCode(String paymentCode) {
    this.paymentCode = paymentCode;
    return this;
  }

 /**
   * Get voucherCode
   * @return voucherCode
  **/
  @JsonProperty("voucher_code")
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

  public CustomerOrderDetailsResponsePaymentMethods voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponsePaymentMethods {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentCode: ").append(toIndentedString(paymentCode)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
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

