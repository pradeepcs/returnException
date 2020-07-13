package com.lmg.returns.exception.model.order.returns;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnPolicyEnquiryReqOrderLines  {
  

  private String itemId = null;


  private String deliveryType = null;
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

  public ReturnPolicyEnquiryReqOrderLines itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get deliveryType
   * @return deliveryType
  **/
  @JsonProperty("delivery_type")
  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public ReturnPolicyEnquiryReqOrderLines deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicyEnquiryReqOrderLines {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
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

