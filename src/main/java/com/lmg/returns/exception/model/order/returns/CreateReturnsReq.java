package com.lmg.returns.exception.model.order.returns;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * 
 **/
public class CreateReturnsReq  {
  
  private String customerOrderId = null;

  private String enterpriseCode = null;

  private String source = null;

  private String cashierName = null;

  private String cashierIdentifier = null;

  private String isGuestUser = null;

  private String storeNumber = null;

  private String deliveryType = null;

  private String comment = null;

  private String reason = null;

  private String rdoNumber = null;

  private String carrierCode = null;

  private String trackingNumber = null;

  private String shipNode = null;

  private String territoryCode = null;

  private List<CreateReturnsReqOrderLines> orderLines = null;

  private List<ReturnRefundEnquiryRespRefundOptions> refundOptions = null;

  private String pickupDate = null;

  private String pickupSlot = null;

  private CreateReturnsReqPickupAddress pickupAddress = null;

  private CreateReturnsReqPickupAddress additionalAddress = null;
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

  public CreateReturnsReq customerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
    return this;
  }

 /**
   * Get enterpriseCode
   * @return enterpriseCode
  **/
  @JsonProperty("enterprise_code")
  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }

  public CreateReturnsReq enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CreateReturnsReq source(String source) {
    this.source = source;
    return this;
  }

 /**
   * Get cashierName
   * @return cashierName
  **/
  @JsonProperty("cashier_name")
  public String getCashierName() {
    return cashierName;
  }

  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }

  public CreateReturnsReq cashierName(String cashierName) {
    this.cashierName = cashierName;
    return this;
  }

 /**
   * Get cashierIdentifier
   * @return cashierIdentifier
  **/
  @JsonProperty("cashier_identifier")
  public String getCashierIdentifier() {
    return cashierIdentifier;
  }

  public void setCashierIdentifier(String cashierIdentifier) {
    this.cashierIdentifier = cashierIdentifier;
  }

  public CreateReturnsReq cashierIdentifier(String cashierIdentifier) {
    this.cashierIdentifier = cashierIdentifier;
    return this;
  }

 /**
   * Get isGuestUser
   * @return isGuestUser
  **/
  @JsonProperty("is_guest_user")
  public String getIsGuestUser() {
    return isGuestUser;
  }

  public void setIsGuestUser(String isGuestUser) {
    this.isGuestUser = isGuestUser;
  }

  public CreateReturnsReq isGuestUser(String isGuestUser) {
    this.isGuestUser = isGuestUser;
    return this;
  }

 /**
   * Get storeNumber
   * @return storeNumber
  **/
  @JsonProperty("store_number")
  public String getStoreNumber() {
    return storeNumber;
  }

  public void setStoreNumber(String storeNumber) {
    this.storeNumber = storeNumber;
  }

  public CreateReturnsReq storeNumber(String storeNumber) {
    this.storeNumber = storeNumber;
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

  public CreateReturnsReq deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

 /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CreateReturnsReq comment(String comment) {
    this.comment = comment;
    return this;
  }

 /**
   * Get reason
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CreateReturnsReq reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Get rdoNumber
   * @return rdoNumber
  **/
  @JsonProperty("rdo_number")
  public String getRdoNumber() {
    return rdoNumber;
  }

  public void setRdoNumber(String rdoNumber) {
    this.rdoNumber = rdoNumber;
  }

  public CreateReturnsReq rdoNumber(String rdoNumber) {
    this.rdoNumber = rdoNumber;
    return this;
  }

 /**
   * Get carrierCode
   * @return carrierCode
  **/
  @JsonProperty("carrier_code")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public CreateReturnsReq carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

 /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @JsonProperty("tracking_number")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public CreateReturnsReq trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

 /**
   * Get shipNode
   * @return shipNode
  **/
  @JsonProperty("ship_node")
  public String getShipNode() {
    return shipNode;
  }

  public void setShipNode(String shipNode) {
    this.shipNode = shipNode;
  }

  public CreateReturnsReq shipNode(String shipNode) {
    this.shipNode = shipNode;
    return this;
  }

 /**
   * Get territoryCode
   * @return territoryCode
  **/
  @JsonProperty("territory_code")
  public String getTerritoryCode() {
    return territoryCode;
  }

  public void setTerritoryCode(String territoryCode) {
    this.territoryCode = territoryCode;
  }

  public CreateReturnsReq territoryCode(String territoryCode) {
    this.territoryCode = territoryCode;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<CreateReturnsReqOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<CreateReturnsReqOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public CreateReturnsReq orderLines(List<CreateReturnsReqOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public CreateReturnsReq addOrderLinesItem(CreateReturnsReqOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }

 /**
   * Get refundOptions
   * @return refundOptions
  **/
  @JsonProperty("refund_options")
  public List<ReturnRefundEnquiryRespRefundOptions> getRefundOptions() {
    return refundOptions;
  }

  public void setRefundOptions(List<ReturnRefundEnquiryRespRefundOptions> refundOptions) {
    this.refundOptions = refundOptions;
  }

  public CreateReturnsReq refundOptions(List<ReturnRefundEnquiryRespRefundOptions> refundOptions) {
    this.refundOptions = refundOptions;
    return this;
  }

  public CreateReturnsReq addRefundOptionsItem(ReturnRefundEnquiryRespRefundOptions refundOptionsItem) {
    this.refundOptions.add(refundOptionsItem);
    return this;
  }

 /**
   * Get pickupDate
   * @return pickupDate
  **/
  @JsonProperty("pickup_date")
  public String getPickupDate() {
    return pickupDate;
  }

  public void setPickupDate(String pickupDate) {
    this.pickupDate = pickupDate;
  }

  public CreateReturnsReq pickupDate(String pickupDate) {
    this.pickupDate = pickupDate;
    return this;
  }

 /**
   * Get pickupSlot
   * @return pickupSlot
  **/
  @JsonProperty("pickup_slot")
  public String getPickupSlot() {
    return pickupSlot;
  }

  public void setPickupSlot(String pickupSlot) {
    this.pickupSlot = pickupSlot;
  }

  public CreateReturnsReq pickupSlot(String pickupSlot) {
    this.pickupSlot = pickupSlot;
    return this;
  }

 /**
   * Get pickupAddress
   * @return pickupAddress
  **/
  @JsonProperty("pickup_address")
  public CreateReturnsReqPickupAddress getPickupAddress() {
    return pickupAddress;
  }

  public void setPickupAddress(CreateReturnsReqPickupAddress pickupAddress) {
    this.pickupAddress = pickupAddress;
  }

  public CreateReturnsReq pickupAddress(CreateReturnsReqPickupAddress pickupAddress) {
    this.pickupAddress = pickupAddress;
    return this;
  }

 /**
   * Get additionalAddress
   * @return additionalAddress
  **/
  @JsonProperty("additional_address")
  public CreateReturnsReqPickupAddress getAdditionalAddress() {
    return additionalAddress;
  }

  public void setAdditionalAddress(CreateReturnsReqPickupAddress additionalAddress) {
    this.additionalAddress = additionalAddress;
  }

  public CreateReturnsReq additionalAddress(CreateReturnsReqPickupAddress additionalAddress) {
    this.additionalAddress = additionalAddress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReturnsReq {\n");
    
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    cashierName: ").append(toIndentedString(cashierName)).append("\n");
    sb.append("    cashierIdentifier: ").append(toIndentedString(cashierIdentifier)).append("\n");
    sb.append("    isGuestUser: ").append(toIndentedString(isGuestUser)).append("\n");
    sb.append("    storeNumber: ").append(toIndentedString(storeNumber)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    rdoNumber: ").append(toIndentedString(rdoNumber)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    shipNode: ").append(toIndentedString(shipNode)).append("\n");
    sb.append("    territoryCode: ").append(toIndentedString(territoryCode)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    refundOptions: ").append(toIndentedString(refundOptions)).append("\n");
    sb.append("    pickupDate: ").append(toIndentedString(pickupDate)).append("\n");
    sb.append("    pickupSlot: ").append(toIndentedString(pickupSlot)).append("\n");
    sb.append("    pickupAddress: ").append(toIndentedString(pickupAddress)).append("\n");
    sb.append("    additionalAddress: ").append(toIndentedString(additionalAddress)).append("\n");
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

