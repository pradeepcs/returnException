package com.lmg.returns.exception.model.order.sales;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsResponseLineCharges  {
  
  private String chargeCategory = null;

  private String chargeName = null;

  private BigDecimal chargePerUnit = null;
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

  public CustomerOrderDetailsResponseLineCharges chargeCategory(String chargeCategory) {
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

  public CustomerOrderDetailsResponseLineCharges chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

 /**
   * Get chargePerUnit
   * @return chargePerUnit
  **/
  @JsonProperty("charge_per_unit")
  public BigDecimal getChargePerUnit() {
    return chargePerUnit;
  }

  public void setChargePerUnit(BigDecimal chargePerUnit) {
    this.chargePerUnit = chargePerUnit;
  }

  public CustomerOrderDetailsResponseLineCharges chargePerUnit(BigDecimal chargePerUnit) {
    this.chargePerUnit = chargePerUnit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponseLineCharges {\n");
    
    sb.append("    chargeCategory: ").append(toIndentedString(chargeCategory)).append("\n");
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    chargePerUnit: ").append(toIndentedString(chargePerUnit)).append("\n");
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

