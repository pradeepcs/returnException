package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesInstructionsObj  {
  
 /**
   * Delivery Slot.
  **/
  private String instructionText = null;

 /**
   * GDMS-SLOT.
  **/
  private String instructionType = null;
 /**
   * Delivery Slot.
   * @return instructionText
  **/
  @JsonProperty("instruction_text")
  public String getInstructionText() {
    return instructionText;
  }

  public void setInstructionText(String instructionText) {
    this.instructionText = instructionText;
  }

  public OrderLinesInstructionsObj instructionText(String instructionText) {
    this.instructionText = instructionText;
    return this;
  }

 /**
   * GDMS-SLOT.
   * @return instructionType
  **/
  @JsonProperty("instruction_type")
  public String getInstructionType() {
    return instructionType;
  }

  public void setInstructionType(String instructionType) {
    this.instructionType = instructionType;
  }

  public OrderLinesInstructionsObj instructionType(String instructionType) {
    this.instructionType = instructionType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesInstructionsObj {\n");
    
    sb.append("    instructionText: ").append(toIndentedString(instructionText)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
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

