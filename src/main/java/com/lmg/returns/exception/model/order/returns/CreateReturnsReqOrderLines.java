package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CreateReturnsReqOrderLines  {
  
  private String itemId = null;

  private String itemDescription = null;

  private BigDecimal unitPrice = null;

  private BigDecimal discountedUnitPrice = null;

  private BigDecimal returnQuantity = null;

  private BigDecimal orderedQuantity = null;

  private BigDecimal itemTax = null;

  private String departmentCode = null;

  private String returnReason = null;

  private String returnComment = null;

  private String unitOfMeasure = null;

  private BigDecimal primeLineNumber = null;
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

  public CreateReturnsReqOrderLines itemId_(String itemId_) {
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

  public CreateReturnsReqOrderLines itemDescription(String itemDescription) {
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

  public CreateReturnsReqOrderLines unitPrice(BigDecimal unitPrice) {
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

  public CreateReturnsReqOrderLines discountedUnitPrice(BigDecimal discountedUnitPrice) {
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

  public CreateReturnsReqOrderLines returnQuantity(BigDecimal returnQuantity) {
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

  public CreateReturnsReqOrderLines orderedQuantity(BigDecimal orderedQuantity) {
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

  public CreateReturnsReqOrderLines itemTax(BigDecimal itemTax) {
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

  public CreateReturnsReqOrderLines departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
    return this;
  }

 /**
   * Get returnReason
   * @return returnReason
  **/
  @JsonProperty("return_reason")
  public String getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }

  public CreateReturnsReqOrderLines returnReason(String returnReason) {
    this.returnReason = returnReason;
    return this;
  }

 /**
   * Get returnComment
   * @return returnComment
  **/
  @JsonProperty("return_comment")
  public String getReturnComment() {
    return returnComment;
  }

  public void setReturnComment(String returnComment) {
    this.returnComment = returnComment;
  }

  public CreateReturnsReqOrderLines returnComment(String returnComment) {
    this.returnComment = returnComment;
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

  public CreateReturnsReqOrderLines unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

 /**
   * Get primeLineNumber
   * @return primeLineNumber
  **/
  @JsonProperty("prime_line_number")
  public BigDecimal getPrimeLineNumber() {
    return primeLineNumber;
  }

  public void setPrimeLineNumber(BigDecimal primeLineNumber) {
    this.primeLineNumber = primeLineNumber;
  }

  public CreateReturnsReqOrderLines primeLineNumber(BigDecimal primeLineNumber) {
    this.primeLineNumber = primeLineNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnsReqOrderLines {\n");
    
    sb.append("    itemId_: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    discountedUnitPrice: ").append(toIndentedString(discountedUnitPrice)).append("\n");
    sb.append("    returnQuantity: ").append(toIndentedString(returnQuantity)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    itemTax: ").append(toIndentedString(itemTax)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    returnComment: ").append(toIndentedString(returnComment)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    primeLineNumber: ").append(toIndentedString(primeLineNumber)).append("\n");
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

