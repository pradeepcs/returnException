package com.lmg.returns.exception.model.order.sales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * 
 **/
public class CustomerOrderDetailsResponse {
  
  private String customerOrderId = null;

  private String enterpriseCode = null;

  private String orderDate = null;

  private String documentType = null;

  private String isGuestUser = null;

  private String shukranLoyaltyCardNo = null;

  private List<CustomerOrderDetailsResponseOrderLines> orderLines = null;

  private List<CustomerOrderDetailsResponseHeaderCharges> headerCharges = null;

  private List<CustomerOrderDetailsResponsePaymentMethods> paymentMethods = null;
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

  public CustomerOrderDetailsResponse customerOrderId(String customerOrderId) {
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

  public CustomerOrderDetailsResponse enterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
    return this;
  }

 /**
   * Get orderDate
   * @return orderDate
  **/
  @JsonProperty("order_date")
  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public CustomerOrderDetailsResponse orderDate(String orderDate) {
    this.orderDate = orderDate;
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

  public CustomerOrderDetailsResponse documentType(String documentType) {
    this.documentType = documentType;
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

  public CustomerOrderDetailsResponse isGuestUser(String isGuestUser) {
    this.isGuestUser = isGuestUser;
    return this;
  }

 /**
   * Get shukranLoyaltyCardNo
   * @return shukranLoyaltyCardNo
  **/
  @JsonProperty("shukran_loyalty_card_no")
  public String getShukranLoyaltyCardNo() {
    return shukranLoyaltyCardNo;
  }

  public void setShukranLoyaltyCardNo(String shukranLoyaltyCardNo) {
    this.shukranLoyaltyCardNo = shukranLoyaltyCardNo;
  }

  public CustomerOrderDetailsResponse shukranLoyaltyCardNo(String shukranLoyaltyCardNo) {
    this.shukranLoyaltyCardNo = shukranLoyaltyCardNo;
    return this;
  }

 /**
   * Get orderLines
   * @return orderLines
  **/
  @JsonProperty("order_lines")
  public List<CustomerOrderDetailsResponseOrderLines> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<CustomerOrderDetailsResponseOrderLines> orderLines) {
    this.orderLines = orderLines;
  }

  public CustomerOrderDetailsResponse orderLines(List<CustomerOrderDetailsResponseOrderLines> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public CustomerOrderDetailsResponse addOrderLinesItem(CustomerOrderDetailsResponseOrderLines orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }

 /**
   * Get headerCharges
   * @return headerCharges
  **/
  @JsonProperty("header_charges")
  public List<CustomerOrderDetailsResponseHeaderCharges> getHeaderCharges() {
    return headerCharges;
  }

  public void setHeaderCharges(List<CustomerOrderDetailsResponseHeaderCharges> headerCharges) {
    this.headerCharges = headerCharges;
  }

  public CustomerOrderDetailsResponse headerCharges(List<CustomerOrderDetailsResponseHeaderCharges> headerCharges) {
    this.headerCharges = headerCharges;
    return this;
  }

  public CustomerOrderDetailsResponse addHeaderChargesItem(CustomerOrderDetailsResponseHeaderCharges headerChargesItem) {
    this.headerCharges.add(headerChargesItem);
    return this;
  }

 /**
   * Get paymentMethods
   * @return paymentMethods
  **/
  @JsonProperty("payment_methods")
  public List<CustomerOrderDetailsResponsePaymentMethods> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<CustomerOrderDetailsResponsePaymentMethods> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public CustomerOrderDetailsResponse paymentMethods(List<CustomerOrderDetailsResponsePaymentMethods> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public CustomerOrderDetailsResponse addPaymentMethodsItem(CustomerOrderDetailsResponsePaymentMethods paymentMethodsItem) {
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerOrderDetailsResponse {\n");
    
    sb.append("    customerOrderId: ").append(toIndentedString(customerOrderId)).append("\n");
    sb.append("    enterpriseCode: ").append(toIndentedString(enterpriseCode)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    isGuestUser: ").append(toIndentedString(isGuestUser)).append("\n");
    sb.append("    shukranLoyaltyCardNo: ").append(toIndentedString(shukranLoyaltyCardNo)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    headerCharges: ").append(toIndentedString(headerCharges)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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

