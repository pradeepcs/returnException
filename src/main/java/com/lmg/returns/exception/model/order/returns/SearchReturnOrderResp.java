package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
  * 
 **/

public class SearchReturnOrderResp  {
  

  private String customerReturnOrderId = null;


  private String carrierCode = null;


  private String trackingNumber = null;


  private String customerOrderId = null;


  private String documentType = null;


  private String enterpriseCode = null;


  private String receivingNode = null;


  private String rdoNumber = null;


  private String retunOrderDate = null;


  private String customerOrderDate = null;


  private String territory = null;


  private String status = null;


  private List<String> cartonIds = null;


  private List<SearchReturnOrderRespOrderLines> orderLines = null;
 /**
   * Get customerReturnOrderId
   * @return customerReturnOrderId
  **/
  @JsonProperty("customer_return_order_id")
  public String getCustomerReturnOrderId() {
    return customerReturnOrderId;
  }

  public void setCustomerReturnOrderId(String customerReturnOrderId) {
    this.customerReturnOrderId = customerReturnOrderId;
  }

  public SearchReturnOrderResp customerReturnOrderId(String customerReturnOrderId) {
    this.customerReturnOrderId = customerReturnOrderId;
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

  public SearchReturnOrderResp carrierCode(String carrierCode) {
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

  public SearchReturnOrderResp trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
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

  public SearchReturnOrderResp customerOrderId(String customerOrderId) {
    this.customerOrderId = customerOrderId;
    return this;
  }

 /**
   * Get documentType
   * @return documentType
  **/
  @JsonProperty("document_type")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public SearchReturnOrderResp documentType(String documentType) {
    this.documentType = documentType;
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

  public SearchReturnOrderResp enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get receivingNode
   * @return receivingNode
  **/
  @JsonProperty("receiving_node")
  public String getReceivingNode() {
    return receivingNode;
  }

  public void setReceivingNode(String receivingNode) {
    this.receivingNode = receivingNode;
  }

  public SearchReturnOrderResp receivingNode(String receivingNode) {
    this.receivingNode = receivingNode;
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

  public SearchReturnOrderResp rdoNumber(String rdoNumber) {
    this.rdoNumber = rdoNumber;
    return this;
  }

 /**
   * Get retunOrderDate
   * @return retunOrderDate
  **/
  @JsonProperty("retun_order_date")
  public String getRetunOrderDate() {
    return retunOrderDate;
  }

  public void setRetunOrderDate(String retunOrderDate) {
    this.retunOrderDate = retunOrderDate;
  }

  public SearchReturnOrderResp retunOrderDate(String retunOrderDate) {
    this.retunOrderDate = retunOrderDate;
    return this;
  }

 /**
   * Get customerOrderDate
   * @return customerOrderDate
  **/
  @JsonProperty("customer_order_date")
  public String getCustomerOrderDate() {
    return customerOrderDate;
  }

  public void setCustomerOrderDate(String customerOrderDate) {
    this.customerOrderDate = customerOrderDate;
  }

  public SearchReturnOrderResp customerOrderDate(String customerOrderDate) {
    this.customerOrderDate = customerOrderDate;
    return this;
  }

 /**
   * Get territory
   * @return territory
  **/
  @JsonProperty("territory")
  public String getTerritory() {
    return territory;
  }

  public void setTerritory(String territory) {
    this.territory = territory;
  }

  public SearchReturnOrderResp territory(String territory) {
    this.territory = territory;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SearchReturnOrderResp status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get cartonIds
   * @return cartonIds
  **/
  @JsonProperty("carton_ids")
  public List<String> getCartonIds() {
    return cartonIds;
  }

  public void setCartonIds(List<String> cartonIds) {
    this.cartonIds = cartonIds;
  }

  public SearchReturnOrderResp cartonIds(List<String> cartonIds) {
    this.cartonIds = cartonIds;
    return this;
  }

  public SearchReturnOrderResp addCartonIdsItem(String cartonIdsItem) {
    this.cartonIds.add(cartonIdsItem);
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<SearchReturnOrderRespOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<SearchReturnOrderRespOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public SearchReturnOrderResp orderLines(List<SearchReturnOrderRespOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public SearchReturnOrderResp addOrderLinesItem(SearchReturnOrderRespOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchReturnOrderResp {\n");
    
    sb.append("    customerReturnOrderId: ").append(toIndentedString(customerReturnOrderId)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    receivingNode: ").append(toIndentedString(receivingNode)).append("\n");
    sb.append("    rdoNumber: ").append(toIndentedString(rdoNumber)).append("\n");
    sb.append("    retunOrderDate: ").append(toIndentedString(retunOrderDate)).append("\n");
    sb.append("    customerOrderDate: ").append(toIndentedString(customerOrderDate)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cartonIds: ").append(toIndentedString(cartonIds)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
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

