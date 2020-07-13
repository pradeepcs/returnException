package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class SearchReturnOrderRespOrderLines  {
  

  private String departmentCode = null;


  private String itemId = null;


  private BigDecimal orderedQuantity = null;


  private BigDecimal retunQuantity = null;


  private BigDecimal returnPrimeLineNumber = null;


  private String itemType = null;


  private String customerReturnReasonCode = null;


  private String unitOfMeasure = null;


  private BigDecimal soPrimeLineNumber = null;
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

  public SearchReturnOrderRespOrderLines departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
    return this;
  }

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

  public SearchReturnOrderRespOrderLines itemId(String itemId) {
    this.itemId = itemId;
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

  public SearchReturnOrderRespOrderLines orderedQuantity(BigDecimal orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

 /**
   * Get retunQuantity
   * @return retunQuantity
  **/
  @JsonProperty("retun_quantity")
  public BigDecimal getRetunQuantity() {
    return retunQuantity;
  }

  public void setRetunQuantity(BigDecimal retunQuantity) {
    this.retunQuantity = retunQuantity;
  }

  public SearchReturnOrderRespOrderLines retunQuantity(BigDecimal retunQuantity) {
    this.retunQuantity = retunQuantity;
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

  public SearchReturnOrderRespOrderLines returnPrimeLineNumber(BigDecimal returnPrimeLineNumber) {
    this.returnPrimeLineNumber = returnPrimeLineNumber;
    return this;
  }

 /**
   * Get itemType
   * @return itemType
  **/
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public SearchReturnOrderRespOrderLines itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

 /**
   * Get customerReturnReasonCode
   * @return customerReturnReasonCode
  **/
  @JsonProperty("customer_return_reason_code")
  public String getCustomerReturnReasonCode() {
    return customerReturnReasonCode;
  }

  public void setCustomerReturnReasonCode(String customerReturnReasonCode) {
    this.customerReturnReasonCode = customerReturnReasonCode;
  }

  public SearchReturnOrderRespOrderLines customerReturnReasonCode(String customerReturnReasonCode) {
    this.customerReturnReasonCode = customerReturnReasonCode;
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

  public SearchReturnOrderRespOrderLines unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

 /**
   * Get soPrimeLineNumber
   * @return soPrimeLineNumber
  **/
  @JsonProperty("so_prime_line_number")
  public BigDecimal getSoPrimeLineNumber() {
    return soPrimeLineNumber;
  }

  public void setSoPrimeLineNumber(BigDecimal soPrimeLineNumber) {
    this.soPrimeLineNumber = soPrimeLineNumber;
  }

  public SearchReturnOrderRespOrderLines soPrimeLineNumber(BigDecimal soPrimeLineNumber) {
    this.soPrimeLineNumber = soPrimeLineNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchReturnOrderRespOrderLines {\n");
    
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    retunQuantity: ").append(toIndentedString(retunQuantity)).append("\n");
    sb.append("    returnPrimeLineNumber: ").append(toIndentedString(returnPrimeLineNumber)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    customerReturnReasonCode: ").append(toIndentedString(customerReturnReasonCode)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    soPrimeLineNumber: ").append(toIndentedString(soPrimeLineNumber)).append("\n");
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

