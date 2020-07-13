package com.lmg.returns.exception.model.order.sales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsResponseHeaderCharges  {
  
  private BigDecimal chargeAmount = null;

  private String chargeCategory = null;

  private String chargeName = null;
 /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @JsonProperty("charge_amount")
  public BigDecimal getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(BigDecimal chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public CustomerOrderDetailsResponseHeaderCharges chargeAmount(BigDecimal chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

 /**
   * Get chargeCategory
   * @return chargeCategory
  **/
  @JsonProperty("charge_category")
  public String getChargeCategory() {
    return chargeCategory;
  }

  public void setChargeCategory(String chargeCategory) {
    this.chargeCategory = chargeCategory;
  }

  public CustomerOrderDetailsResponseHeaderCharges chargeCategory(String chargeCategory) {
    this.chargeCategory = chargeCategory;
    return this;
  }

 /**
   * Get chargeName
   * @return chargeName
  **/
  @JsonProperty("charge_name")
  public String getChargeName() {
    return chargeName;
  }

  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  public CustomerOrderDetailsResponseHeaderCharges chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponseHeaderCharges {\n");
    
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargeCategory: ").append(toIndentedString(chargeCategory)).append("\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
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

