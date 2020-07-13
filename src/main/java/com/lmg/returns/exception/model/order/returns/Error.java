package com.lmg.returns.exception.model.order.returns;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error extends HashMap<String, Object> {
  

  private String httpCode = null;


  private Object httpMessage = null;


  private Object moreInformation = null;
 /**
   * Get httpCode
   * @return httpCode
  **/
  @JsonProperty("httpCode")
  public String getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }

  public Error httpCode(String httpCode) {
    this.httpCode = httpCode;
    return this;
  }

 /**
   * Get httpMessage
   * @return httpMessage
  **/
  @JsonProperty("httpMessage")
  public Object getHttpMessage() {
    return httpMessage;
  }

  public void setHttpMessage(Object httpMessage) {
    this.httpMessage = httpMessage;
  }

  public Error httpMessage(Object httpMessage) {
    this.httpMessage = httpMessage;
    return this;
  }

 /**
   * Get moreInformation
   * @return moreInformation
  **/
  @JsonProperty("moreInformation")
  public Object getMoreInformation() {
    return moreInformation;
  }

  public void setMoreInformation(Object moreInformation) {
    this.moreInformation = moreInformation;
  }

  public Error moreInformation(Object moreInformation) {
    this.moreInformation = moreInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

