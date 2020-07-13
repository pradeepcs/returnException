package com.lmg.returns.exception.model.order.sales;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerOrderDetailsResponseOrderLines {
  
  private BigDecimal orderedQuantity = null;

  private String departmentCode = null;

  private BigDecimal primeLineNumber = null;

  private BigDecimal returnableQuantity = null;

  private String deliveryDate = null;

  private String deliveryType = null;

  private String isReturnable = null;

  private String itemType = null;

  private List<CustomerOrderDetailsResponseLineCharges> lineCharges = null;

  private CustomerOrderDetailsResponseLinePriceInformation linePriceInformation = null;

  private CustomerOrderDetailsResponseItemDetails itemDetails = null;
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

  public CustomerOrderDetailsResponseOrderLines orderedQuantity(BigDecimal orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
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

  public CustomerOrderDetailsResponseOrderLines departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
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

  public CustomerOrderDetailsResponseOrderLines primeLineNumber(BigDecimal primeLineNumber) {
    this.primeLineNumber = primeLineNumber;
    return this;
  }

 /**
   * Get returnableQuantity
   * @return returnableQuantity
  **/
  @JsonProperty("returnable_quantity")
  public BigDecimal getReturnableQuantity() {
    return returnableQuantity;
  }

  public void setReturnableQuantity(BigDecimal returnableQuantity) {
    this.returnableQuantity = returnableQuantity;
  }

  public CustomerOrderDetailsResponseOrderLines returnableQuantity(BigDecimal returnableQuantity) {
    this.returnableQuantity = returnableQuantity;
    return this;
  }

 /**
   * Get deliveryDate
   * @return deliveryDate
  **/
  @JsonProperty("delivery_date")
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public CustomerOrderDetailsResponseOrderLines deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
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

  public CustomerOrderDetailsResponseOrderLines deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

 /**
   * Get isReturnable
   * @return isReturnable
  **/
  @JsonProperty("is_returnable")
  public String getIsReturnable() {
    return isReturnable;
  }

  public void setIsReturnable(String isReturnable) {
    this.isReturnable = isReturnable;
  }

  public CustomerOrderDetailsResponseOrderLines isReturnable(String isReturnable) {
    this.isReturnable = isReturnable;
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

  public CustomerOrderDetailsResponseOrderLines itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

 /**
   * Get lineCharges
   * @return lineCharges
  **/
  @JsonProperty("line_charges")
  public List<CustomerOrderDetailsResponseLineCharges> getLineCharges() {
    return lineCharges;
  }

  public void setLineCharges(List<CustomerOrderDetailsResponseLineCharges> lineCharges) {
    this.lineCharges = lineCharges;
  }

  public CustomerOrderDetailsResponseOrderLines lineCharges(List<CustomerOrderDetailsResponseLineCharges> lineCharges) {
    this.lineCharges = lineCharges;
    return this;
  }

  public CustomerOrderDetailsResponseOrderLines addLineChargesItem(CustomerOrderDetailsResponseLineCharges lineChargesItem) {
    this.lineCharges.add(lineChargesItem);
    return this;
  }

 /**
   * Get linePriceInformation
   * @return linePriceInformation
  **/
  @JsonProperty("line_price_information")
  public CustomerOrderDetailsResponseLinePriceInformation getLinePriceInformation() {
    return linePriceInformation;
  }

  public void setLinePriceInformation(CustomerOrderDetailsResponseLinePriceInformation linePriceInformation) {
    this.linePriceInformation = linePriceInformation;
  }

  public CustomerOrderDetailsResponseOrderLines linePriceInformation(CustomerOrderDetailsResponseLinePriceInformation linePriceInformation) {
    this.linePriceInformation = linePriceInformation;
    return this;
  }

 /**
   * Get itemDetails
   * @return itemDetails
  **/
  @JsonProperty("item_details")
  public CustomerOrderDetailsResponseItemDetails getItemDetails() {
    return itemDetails;
  }

  public void setItemDetails(CustomerOrderDetailsResponseItemDetails itemDetails) {
    this.itemDetails = itemDetails;
  }

  public CustomerOrderDetailsResponseOrderLines itemDetails(CustomerOrderDetailsResponseItemDetails itemDetails) {
    this.itemDetails = itemDetails;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponseOrderLines {\n");
    
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    primeLineNumber: ").append(toIndentedString(primeLineNumber)).append("\n");
    sb.append("    returnableQuantity: ").append(toIndentedString(returnableQuantity)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    isReturnable: ").append(toIndentedString(isReturnable)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    lineCharges: ").append(toIndentedString(lineCharges)).append("\n");
    sb.append("    linePriceInformation: ").append(toIndentedString(linePriceInformation)).append("\n");
    sb.append("    itemDetails: ").append(toIndentedString(itemDetails)).append("\n");
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

