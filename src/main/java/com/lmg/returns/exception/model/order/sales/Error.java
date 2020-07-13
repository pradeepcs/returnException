package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Error  {
  
 /**
   * Standard HTTP Code
  **/
  private Integer httpCode = null;

 /**
   * Standard HTTP reason phrase
  **/
  private String httpMessage = null;

 /**
   * This is a custom field to describe the error situation
  **/
  private String moreInformation = null;
 /**
   * Standard HTTP Code
   * @return httpCode
  **/
  @JsonProperty("httpCode")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public Error httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

 /**
   * Standard HTTP reason phrase
   * @return httpMessage
  **/
  @JsonProperty("httpMessage")
  public String getHttpMessage() {
    return httpMessage;
  }

  public void setHttpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
  }

  public Error httpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
    return this;
  }

 /**
   * This is a custom field to describe the error situation
   * @return moreInformation
  **/
  @JsonProperty("moreInformation")
  public String getMoreInformation() {
    return moreInformation;
  }

  public void setMoreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
  }

  public Error moreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    moreInformation: ").append(toIndentedString(moreInformation)).append("\n");
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

