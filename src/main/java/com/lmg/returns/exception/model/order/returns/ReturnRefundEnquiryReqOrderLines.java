package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ReturnRefundEnquiryReqOrderLines  {
  

  private String itemId = null;


  private BigDecimal returnQuantity = null;
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

  public ReturnRefundEnquiryReqOrderLines itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get returnQuantity
   * @return returnQuantity
  **/
  @JsonProperty("return_quantity")
  public BigDecimal getReturnQuantity() {
    return returnQuantity;
  }

  public void setReturnQuantity(BigDecimal returnQuantity) {
    this.returnQuantity = returnQuantity;
  }

  public ReturnRefundEnquiryReqOrderLines returnQuantity(BigDecimal returnQuantity) {
    this.returnQuantity = returnQuantity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRefundEnquiryReqOrderLines {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    returnQuantity: ").append(toIndentedString(returnQuantity)).append("\n");
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

