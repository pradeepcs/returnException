package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesItemObj  {
  
 /**
   * The identifier for the item.SKU ID.
  **/
  private String id = null;

 /**
   * The description of the item.Item Short Description.
  **/
  private String description = null;

 /**
   * Map this attribute only when CommonItemId is not null or blank.
  **/
  private String commonItemId = null;

 /**
   * The generic type of an item.Identifier to indicate if the item is GDMS or Non GDMS.
  **/
  private String isConceptDelivery = null;
 /**
   * The identifier for the item.SKU ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderLinesItemObj id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The description of the item.Item Short Description.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderLinesItemObj description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Map this attribute only when CommonItemId is not null or blank.
   * @return commonItemId
  **/
  @JsonProperty("common_item_id")
  public String getCommonItemId() {
    return commonItemId;
  }

  public void setCommonItemId(String commonItemId) {
    this.commonItemId = commonItemId;
  }

  public OrderLinesItemObj commonItemId(String commonItemId) {
    this.commonItemId = commonItemId;
    return this;
  }

 /**
   * The generic type of an item.Identifier to indicate if the item is GDMS or Non GDMS.
   * @return isConceptDelivery
  **/
  @JsonProperty("is_concept_delivery")
  public String getIsConceptDelivery() {
    return isConceptDelivery;
  }

  public void setIsConceptDelivery(String isConceptDelivery) {
    this.isConceptDelivery = isConceptDelivery;
  }

  public OrderLinesItemObj isConceptDelivery(String isConceptDelivery) {
    this.isConceptDelivery = isConceptDelivery;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesItemObj {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    commonItemId: ").append(toIndentedString(commonItemId)).append("\n");
    sb.append("    isConceptDelivery: ").append(toIndentedString(isConceptDelivery)).append("\n");
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

