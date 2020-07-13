package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class ReturnExceptionReq {

    @NotNull(message = "action can not be null")
    @NotEmpty(message = "action can not be empty")
    private String action = null;

    private String customerReturnOrderId = null;

    private String enterpriseCode = null;

    private String shipNode = null;

    private String rdoNumber = null;

    private String customerOrderId = null;

    private List<ReturnExcessReqOrderLine> orderLines = null;

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("customer_return_order_id")
    public String getCustomerReturnOrderId() {
        return customerReturnOrderId;
    }

    public void setCustomerReturnOrderId(String customerReturnOrderId) {
        this.customerReturnOrderId = customerReturnOrderId;
    }

    @JsonProperty("enterprise_code")
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    @JsonProperty("ship_node")
    public String getShipNode() {
        return shipNode;
    }

    public void setShipNode(String shipNode) {
        this.shipNode = shipNode;
    }

    @JsonProperty("rdo_number")
    public String getRdoNumber() {
        return rdoNumber;
    }

    public void setRdoNumber(String rdoNumber) {
        this.rdoNumber = rdoNumber;
    }

    @JsonProperty("customer_order_id")
    public String getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(String customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    @JsonProperty("order_lines")
    public List<ReturnExcessReqOrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<ReturnExcessReqOrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReturnExceptionReq)) return false;
        ReturnExceptionReq that = (ReturnExceptionReq) o;
        return Objects.equals(getAction(), that.getAction()) &&
                Objects.equals(getCustomerReturnOrderId(), that.getCustomerReturnOrderId()) &&
                Objects.equals(getEnterpriseCode(), that.getEnterpriseCode()) &&
                Objects.equals(getShipNode(), that.getShipNode()) &&
                Objects.equals(getRdoNumber(), that.getRdoNumber()) &&
                Objects.equals(getCustomerOrderId(), that.getCustomerOrderId()) &&
                Objects.equals(getOrderLines(), that.getOrderLines());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAction(), getCustomerReturnOrderId(), getEnterpriseCode(), getShipNode(),
                getRdoNumber(), getCustomerOrderId(), getOrderLines());
    }

    @Override
    public String toString() {
        return "ReturnExcessReq{" +
                "action='" + action + '\'' +
                ", customerReturnOrderId='" + customerReturnOrderId + '\'' +
                ", enterpriseCode='" + enterpriseCode + '\'' +
                ", shipNode='" + shipNode + '\'' +
                ", rdoNumber='" + rdoNumber + '\'' +
                ", customerOrderId='" + customerOrderId + '\'' +
                ", orderLines=" + orderLines +
                '}';
    }
}
