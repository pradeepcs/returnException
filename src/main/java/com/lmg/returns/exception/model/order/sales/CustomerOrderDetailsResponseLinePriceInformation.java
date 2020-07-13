package com.lmg.returns.exception.model.order.sales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsResponseLinePriceInformation  {
  
  private String isPriceLocked = null;

  private BigDecimal refundPrice = null;

  private BigDecimal unitPrice = null;
 /**
   * Get isPriceLocked
   * @return isPriceLocked
  **/
  @JsonProperty("is_price_locked")
  public String getIsPriceLocked() {
    return isPriceLocked;
  }

  public void setIsPriceLocked(String isPriceLocked) {
    this.isPriceLocked = isPriceLocked;
  }

  public CustomerOrderDetailsResponseLinePriceInformation isPriceLocked(String isPriceLocked) {
    this.isPriceLocked = isPriceLocked;
    return this;
  }

 /**
   * Get refundPrice
   * @return refundPrice
  **/
  @JsonProperty("refund_price")
  public BigDecimal getRefundPrice() {
    return refundPrice;
  }

  public void setRefundPrice(BigDecimal refundPrice) {
    this.refundPrice = refundPrice;
  }

  public CustomerOrderDetailsResponseLinePriceInformation refundPrice(BigDecimal refundPrice) {
    this.refundPrice = refundPrice;
    return this;
  }

 /**
   * Get unitPrice
   * @return unitPrice
  **/
  @JsonProperty("unit_price")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public CustomerOrderDetailsResponseLinePriceInformation unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponseLinePriceInformation {\n");
    
    sb.append("    isPriceLocked: ").append(toIndentedString(isPriceLocked)).append("\n");
    sb.append("    refundPrice: ").append(toIndentedString(refundPrice)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

