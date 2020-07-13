package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesChargesObj  {
  
 /**
   * Charge name for which tax is being charged. For example, Price Ticket.
  **/
  private String chargeName = null;

 /**
   * The charge category of the LineCharge or HeaderCharge for which this award was created.
  **/
  private String chargeCategory = null;

 /**
   * Charge per unit for the item on this order/invoice line.
  **/
  private Double chargePerUnit = null;
 /**
   * Charge name for which tax is being charged. For example, Price Ticket.
   * @return chargeName
  **/
  @JsonProperty("charge_name")
  public String getChargeName() {
    return chargeName;
  }

  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  public OrderLinesChargesObj chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }

 /**
   * The charge category of the LineCharge or HeaderCharge for which this award was created.
   * @return chargeCategory
  **/
  @JsonProperty("charge_category")
  public String getChargeCategory() {
    return chargeCategory;
  }

  public void setChargeCategory(String chargeCategory) {
    this.chargeCategory = chargeCategory;
  }

  public OrderLinesChargesObj chargeCategory(String chargeCategory) {
    this.chargeCategory = chargeCategory;
    return this;
  }

 /**
   * Charge per unit for the item on this order/invoice line.
   * @return chargePerUnit
  **/
  @JsonProperty("charge_per_unit")
  public Double getChargePerUnit() {
    return chargePerUnit;
  }

  public void setChargePerUnit(Double chargePerUnit) {
    this.chargePerUnit = chargePerUnit;
  }

  public OrderLinesChargesObj chargePerUnit(Double chargePerUnit) {
    this.chargePerUnit = chargePerUnit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesChargesObj {\n");
    
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    chargeCategory: ").append(toIndentedString(chargeCategory)).append("\n");
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

