package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesTaxObj  {
  
 /**
   * The tax amount
  **/
  private Double tax = null;

 /**
   * Type of tax.
  **/
  private String taxName = null;

 /**
   * Percentage amount for tax calculation.
  **/
  private Double taxPercentage = null;

 /**
   * Tax Charge Category.
  **/
  private String chargeCategory = null;

 /**
   * Tax Charge Name
  **/
  private String chargeName = null;
 /**
   * The tax amount
   * @return tax
  **/
  @JsonProperty("tax")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public OrderLinesTaxObj tax(Double tax) {
    this.tax = tax;
    return this;
  }

 /**
   * Type of tax.
   * @return taxName
  **/
  @JsonProperty("tax_name")
  public String getTaxName() {
    return taxName;
  }

  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }

  public OrderLinesTaxObj taxName(String taxName) {
    this.taxName = taxName;
    return this;
  }

 /**
   * Percentage amount for tax calculation.
   * @return taxPercentage
  **/
  @JsonProperty("tax_percentage")
  public Double getTaxPercentage() {
    return taxPercentage;
  }

  public void setTaxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }

  public OrderLinesTaxObj taxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
    return this;
  }

 /**
   * Tax Charge Category.
   * @return chargeCategory
  **/
  @JsonProperty("charge_category")
  public String getChargeCategory() {
    return chargeCategory;
  }

  public void setChargeCategory(String chargeCategory) {
    this.chargeCategory = chargeCategory;
  }

  public OrderLinesTaxObj chargeCategory(String chargeCategory) {
    this.chargeCategory = chargeCategory;
    return this;
  }

 /**
   * Tax Charge Name
   * @return chargeName
  **/
  @JsonProperty("charge_name")
  public String getChargeName() {
    return chargeName;
  }

  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }

  public OrderLinesTaxObj chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesTaxObj {\n");
    
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
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

