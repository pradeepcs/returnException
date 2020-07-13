package com.lmg.returns.exception.model.order.sales;


import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLinesReservationsObj  {
  
 /**
   * To pass the line level specific reservation ID which have received while making Inventory Reservation call.
  **/
  private String reservationId = null;

 /**
   * Ordered Quantity.
  **/
  private Double reservedQuantity = null;

 /**
   * The unique identifer for the component item.SKU ID.
  **/
  private String itemId = null;

 /**
   * The ship node at which the item has been reserved.To pass the line level specific Shipnode which have received while making Inventory Reservation call.
  **/
  private String shipNode = null;
 /**
   * To pass the line level specific reservation ID which have received while making Inventory Reservation call.
   * @return reservationId
  **/
  @JsonProperty("reservation_id")
  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }

  public OrderLinesReservationsObj reservationId(String reservationId) {
    this.reservationId = reservationId;
    return this;
  }

 /**
   * Ordered Quantity.
   * @return reservedQuantity
  **/
  @JsonProperty("reserved_quantity")
  public Double getReservedQuantity() {
    return reservedQuantity;
  }

  public void setReservedQuantity(Double reservedQuantity) {
    this.reservedQuantity = reservedQuantity;
  }

  public OrderLinesReservationsObj reservedQuantity(Double reservedQuantity) {
    this.reservedQuantity = reservedQuantity;
    return this;
  }

 /**
   * The unique identifer for the component item.SKU ID.
   * @return itemId
  **/
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public OrderLinesReservationsObj itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The ship node at which the item has been reserved.To pass the line level specific Shipnode which have received while making Inventory Reservation call.
   * @return shipNode
  **/
  @JsonProperty("ship_node")
  public String getShipNode() {
    return shipNode;
  }

  public void setShipNode(String shipNode) {
    this.shipNode = shipNode;
  }

  public OrderLinesReservationsObj shipNode(String shipNode) {
    this.shipNode = shipNode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesReservationsObj {\n");
    
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    reservedQuantity: ").append(toIndentedString(reservedQuantity)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    shipNode: ").append(toIndentedString(shipNode)).append("\n");
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

