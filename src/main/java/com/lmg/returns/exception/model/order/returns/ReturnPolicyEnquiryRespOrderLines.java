package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ReturnPolicyEnquiryRespOrderLines  {
  

  private Object itemId = null;


  private String itemDescription = null;


  private BigDecimal maximumReturnableQuantity = null;


  private Boolean isReturnable = null;


  private Boolean withInReturnWindow = null;


  private BigDecimal returnWindowPeriod = null;


  private BigDecimal orderedQuantity = null;


  private String departmentCode = null;


  private String deliveryType = null;
 /**
   * Get itemId
   * @return itemId
  **/
  @JsonProperty("item_id")
  public Object getItemId() {
    return itemId;
  }

  public void setItemId(Object itemId) {
    this.itemId = itemId;
  }

  public ReturnPolicyEnquiryRespOrderLines itemId(Object itemId) {
    this.itemId = itemId;
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

  public ReturnPolicyEnquiryRespOrderLines itemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
    return this;
  }

 /**
   * Get maximumReturnableQuantity
   * @return maximumReturnableQuantity
  **/
  @JsonProperty("maximum_returnable_quantity")
  public BigDecimal getMaximumReturnableQuantity() {
    return maximumReturnableQuantity;
  }

  public void setMaximumReturnableQuantity(BigDecimal maximumReturnableQuantity) {
    this.maximumReturnableQuantity = maximumReturnableQuantity;
  }

  public ReturnPolicyEnquiryRespOrderLines maximumReturnableQuantity(BigDecimal maximumReturnableQuantity) {
    this.maximumReturnableQuantity = maximumReturnableQuantity;
    return this;
  }

 /**
   * Get isReturnable
   * @return isReturnable
  **/
  @JsonProperty("is_returnable")
  public Boolean isIsReturnable() {
    return isReturnable;
  }

  public void setIsReturnable(Boolean isReturnable) {
    this.isReturnable = isReturnable;
  }

  public ReturnPolicyEnquiryRespOrderLines isReturnable(Boolean isReturnable) {
    this.isReturnable = isReturnable;
    return this;
  }

 /**
   * Get withInReturnWindow
   * @return withInReturnWindow
  **/
  @JsonProperty("with_in_return_window")
  public Boolean isWithInReturnWindow() {
    return withInReturnWindow;
  }

  public void setWithInReturnWindow(Boolean withInReturnWindow) {
    this.withInReturnWindow = withInReturnWindow;
  }

  public ReturnPolicyEnquiryRespOrderLines withInReturnWindow(Boolean withInReturnWindow) {
    this.withInReturnWindow = withInReturnWindow;
    return this;
  }

 /**
   * Get returnWindowPeriod
   * @return returnWindowPeriod
  **/
  @JsonProperty("return_window_period")
  public BigDecimal getReturnWindowPeriod() {
    return returnWindowPeriod;
  }

  public void setReturnWindowPeriod(BigDecimal returnWindowPeriod) {
    this.returnWindowPeriod = returnWindowPeriod;
  }

  public ReturnPolicyEnquiryRespOrderLines returnWindowPeriod(BigDecimal returnWindowPeriod) {
    this.returnWindowPeriod = returnWindowPeriod;
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

  public ReturnPolicyEnquiryRespOrderLines orderedQuantity(BigDecimal orderedQuantity) {
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

  public ReturnPolicyEnquiryRespOrderLines departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
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

  public ReturnPolicyEnquiryRespOrderLines deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnPolicyEnquiryRespOrderLines {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemDescription: ").append(toIndentedString(itemDescription)).append("\n");
    sb.append("    maximumReturnableQuantity: ").append(toIndentedString(maximumReturnableQuantity)).append("\n");
    sb.append("    isReturnable: ").append(toIndentedString(isReturnable)).append("\n");
    sb.append("    withInReturnWindow: ").append(toIndentedString(withInReturnWindow)).append("\n");
    sb.append("    returnWindowPeriod: ").append(toIndentedString(returnWindowPeriod)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
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

