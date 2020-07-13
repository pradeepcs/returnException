package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CreateReturnsRespOrderLines  {
  
  private String itemId = null;

  private String departmentCode = null;

  private BigDecimal returnQuantity = null;

  private BigDecimal returnPrimeLineNumber = null;

  private BigDecimal unitPrice = null;

  private BigDecimal discountedUnitPrice = null;

  private BigDecimal lineTotal = null;
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

  public CreateReturnsRespOrderLines itemId(String itemId) {
    this.itemId = itemId;
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

  public CreateReturnsRespOrderLines departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
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

  public CreateReturnsRespOrderLines returnQuantity(BigDecimal returnQuantity) {
    this.returnQuantity = returnQuantity;
    return this;
  }

 /**
   * Get returnPrimeLineNumber
   * @return returnPrimeLineNumber
  **/
  @JsonProperty("return_prime_line_number")
  public BigDecimal getReturnPrimeLineNumber() {
    return returnPrimeLineNumber;
  }

  public void setReturnPrimeLineNumber(BigDecimal returnPrimeLineNumber) {
    this.returnPrimeLineNumber = returnPrimeLineNumber;
  }

  public CreateReturnsRespOrderLines returnPrimeLineNumber(BigDecimal returnPrimeLineNumber) {
    this.returnPrimeLineNumber = returnPrimeLineNumber;
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

  public CreateReturnsRespOrderLines unitPrice(BigDecimal unitPrice) {
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

  public CreateReturnsRespOrderLines discountedUnitPrice(BigDecimal discountedUnitPrice) {
    this.discountedUnitPrice = discountedUnitPrice;
    return this;
  }

 /**
   * Get lineTotal
   * @return lineTotal
  **/
  @JsonProperty("line_total")
  public BigDecimal getLineTotal() {
    return lineTotal;
  }

  public void setLineTotal(BigDecimal lineTotal) {
    this.lineTotal = lineTotal;
  }

  public CreateReturnsRespOrderLines lineTotal(BigDecimal lineTotal) {
    this.lineTotal = lineTotal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnsRespOrderLines {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    returnQuantity: ").append(toIndentedString(returnQuantity)).append("\n");
    sb.append("    returnPrimeLineNumber: ").append(toIndentedString(returnPrimeLineNumber)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    discountedUnitPrice: ").append(toIndentedString(discountedUnitPrice)).append("\n");
    sb.append("    lineTotal: ").append(toIndentedString(lineTotal)).append("\n");
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

