package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsResponseItemDetails  {
  
  private String itemId = null;

  private String unitOfMeasure = null;

  private String description = null;

  private String productLine = null;
 /**
   * Get itemId
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CustomerOrderDetailsResponseItemDetails itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  **/
  @JsonProperty("unit_of_measure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public CustomerOrderDetailsResponseItemDetails unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomerOrderDetailsResponseItemDetails description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get productLine
   * @return productLine
  **/
  @JsonProperty("product_line")
  public String getProductLine() {
    return productLine;
  }

  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }

  public CustomerOrderDetailsResponseItemDetails productLine(String productLine) {
    this.productLine = productLine;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponseItemDetails {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
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

