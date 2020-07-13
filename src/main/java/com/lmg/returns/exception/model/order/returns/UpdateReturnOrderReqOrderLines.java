package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class UpdateReturnOrderReqOrderLines  {
  

  private String itemId = null;


  private String customerOrderId = null;


  private String dispositionCode = null;


  private BigDecimal cancelQuantity = null;


  private BigDecimal excessQuantity = null;


  private BigDecimal primeLineNumber = null;


  private String isItemOnCustomerOrder = null;


  private String isLmgItem = null;
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

  public UpdateReturnOrderReqOrderLines itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * Get customerOrderId
   * @return customerOrderId
  **/
  @JsonProperty("customer_order_id")
  public String getCustomerOrderId() {
    return customerOrderId;
  }

  public void setCustomerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
  }

  public UpdateReturnOrderReqOrderLines customerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
    return this;
  }

 /**
   * Get dispositionCode
   * @return dispositionCode
  **/
  @JsonProperty("disposition_code")
  public String getDispositionCode() {
    return dispositionCode;
  }

  public void setDispositionCode(String dispositionCode) {
    this.dispositionCode = dispositionCode;
  }

  public UpdateReturnOrderReqOrderLines dispositionCode(String dispositionCode) {
    this.dispositionCode = dispositionCode;
    return this;
  }

 /**
   * Get cancelQuantity
   * @return cancelQuantity
  **/
  @JsonProperty("cancel_quantity")
  public BigDecimal getCancelQuantity() {
    return cancelQuantity;
  }

  public void setCancelQuantity(BigDecimal cancelQuantity) {
    this.cancelQuantity = cancelQuantity;
  }

  public UpdateReturnOrderReqOrderLines cancelQuantity(BigDecimal cancelQuantity) {
    this.cancelQuantity = cancelQuantity;
    return this;
  }

 /**
   * Get excessQuantity
   * @return excessQuantity
  **/
  @JsonProperty("excess_quantity")
  public BigDecimal getExcessQuantity() {
    return excessQuantity;
  }

  public void setExcessQuantity(BigDecimal excessQuantity) {
    this.excessQuantity = excessQuantity;
  }

  public UpdateReturnOrderReqOrderLines excessQuantity(BigDecimal excessQuantity) {
    this.excessQuantity = excessQuantity;
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

  public UpdateReturnOrderReqOrderLines primeLineNumber(BigDecimal primeLineNumber) {
    this.primeLineNumber = primeLineNumber;
    return this;
  }

 /**
   * Get isItemOnCustomerOrder
   * @return isItemOnCustomerOrder
  **/
  @JsonProperty("is_item_on_customer_order")
  public String getIsItemOnCustomerOrder() {
    return isItemOnCustomerOrder;
  }

  public void setIsItemOnCustomerOrder(String isItemOnCustomerOrder) {
    this.isItemOnCustomerOrder = isItemOnCustomerOrder;
  }

  public UpdateReturnOrderReqOrderLines isItemOnCustomerOrder(String isItemOnCustomerOrder) {
    this.isItemOnCustomerOrder = isItemOnCustomerOrder;
    return this;
  }

 /**
   * Get isLmgItem
   * @return isLmgItem
  **/
  @JsonProperty("is_lmg_item")
  public String getIsLmgItem() {
    return isLmgItem;
  }

  public void setIsLmgItem(String isLmgItem) {
    this.isLmgItem = isLmgItem;
  }

  public UpdateReturnOrderReqOrderLines isLmgItem(String isLmgItem) {
    this.isLmgItem = isLmgItem;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateReturnOrderReqOrderLines {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    dispositionCode: ").append(toIndentedString(dispositionCode)).append("\n");
    sb.append("    cancelQuantity: ").append(toIndentedString(cancelQuantity)).append("\n");
    sb.append("    excessQuantity: ").append(toIndentedString(excessQuantity)).append("\n");
    sb.append("    primeLineNumber: ").append(toIndentedString(primeLineNumber)).append("\n");
    sb.append("    isItemOnCustomerOrder: ").append(toIndentedString(isItemOnCustomerOrder)).append("\n");
    sb.append("    isLmgItem: ").append(toIndentedString(isLmgItem)).append("\n");
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

