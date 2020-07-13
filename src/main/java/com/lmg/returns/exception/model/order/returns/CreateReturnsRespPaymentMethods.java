package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CreateReturnsRespPaymentMethods  {
  
  private String paymentType = null;

  private String paymentCode = null;

  private BigDecimal amount = null;

  private String voucherCode = null;

  private String voucherExpiryDate = null;
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

  public CreateReturnsRespPaymentMethods paymentType(String paymentType) {
    this.paymentType = paymentType;
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

  public CreateReturnsRespPaymentMethods paymentCode(String paymentCode) {
    this.paymentCode = paymentCode;
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

  public CreateReturnsRespPaymentMethods amount(BigDecimal amount) {
    this.amount = amount;
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

  public CreateReturnsRespPaymentMethods voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

 /**
   * Get voucherExpiryDate
   * @return voucherExpiryDate
  **/
  @JsonProperty("voucher_expiry_date")
  public String getVoucherExpiryDate() {
    return voucherExpiryDate;
  }

  public void setVoucherExpiryDate(String voucherExpiryDate) {
    this.voucherExpiryDate = voucherExpiryDate;
  }

  public CreateReturnsRespPaymentMethods voucherExpiryDate(String voucherExpiryDate) {
    this.voucherExpiryDate = voucherExpiryDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnsRespPaymentMethods {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentCode: ").append(toIndentedString(paymentCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    voucherExpiryDate: ").append(toIndentedString(voucherExpiryDate)).append("\n");
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

