package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ReturnRefundEnquiryRespOrderLines  {
  

  private String itemId = null;


  private String itemDescription = null;


  private BigDecimal unitPrice = null;


  private BigDecimal discountedUnitPrice = null;


  private BigDecimal returnQuantity = null;


  private BigDecimal orderedQuantity = null;


  private BigDecimal itemTax = null;


  private String departmentCode = null;
 /**
   * Get itemId_
   * @return itemId_
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public ReturnRefundEnquiryRespOrderLines itemId_(String itemId_) {
    this.itemId = itemId_;
    return this;
  }

 /**
   * Get itemDescription
   * @return itemDescription
  **/
  @JsonProperty("item_description")
  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public ReturnRefundEnquiryRespOrderLines itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
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

  public ReturnRefundEnquiryRespOrderLines unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

 /**
   * Get discountedUnitPrice
   * @return discountedUnitPrice
  **/
  @JsonProperty("discounted_unit_price")
  public BigDecimal getDiscountedUnitPrice() {
    return discountedUnitPrice;
  }

  public void setDiscountedUnitPrice(BigDecimal discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
  }

  public ReturnRefundEnquiryRespOrderLines discountedUnitPrice(BigDecimal discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
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

  public ReturnRefundEnquiryRespOrderLines returnQuantity(BigDecimal returnQuantity) {
    this.returnQuantity = returnQuantity;
    return this;
  }

 /**
   * Get orderedQuantity
   * @return orderedQuantity
  **/
  @JsonProperty("ordered_quantity")
  public BigDecimal getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(BigDecimal orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }

  public ReturnRefundEnquiryRespOrderLines orderedQuantity(BigDecimal orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

 /**
   * Get itemTax
   * @return itemTax
  **/
  @JsonProperty("item_tax")
  public BigDecimal getItemTax() {
    return itemTax;
  }

  public void setItemTax(BigDecimal itemTax) {
    this.itemTax = itemTax;
  }

  public ReturnRefundEnquiryRespOrderLines itemTax(BigDecimal itemTax) {
    this.itemTax = itemTax;
    return this;
  }

 /**
   * Get departmentCode
   * @return departmentCode
  **/
  @JsonProperty("department_code")
  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  public ReturnRefundEnquiryRespOrderLines departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRefundEnquiryRespOrderLines {\n");
    
    sb.append("    itemId_: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    discountedUnitPrice: ").append(toIndentedString(discountedUnitPrice)).append("\n");
    sb.append("    returnQuantity: ").append(toIndentedString(returnQuantity)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    itemTax: ").append(toIndentedString(itemTax)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
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

