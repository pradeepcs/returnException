package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesPriceInfoObj  {
  
 /**
   * The unit price for the order line.Actual Unit Price of the Item inclusive of Tax.
  **/
  private Double unitPrice = null;
 /**
   * The unit price for the order line.Actual Unit Price of the Item inclusive of Tax.
   * @return unitPrice
  **/
  @JsonProperty("unit_price")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OrderLinesPriceInfoObj unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesPriceInfoObj {\n");
    
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

