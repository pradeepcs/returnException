package com.lmg.returns.exception.model.order.returns;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class ReturnExcessReqOrderLine implements Serializable {

    private String dispositionCode = null;

    private BigDecimal excessQuantity = null;

    private String isItemOnCustomerOrder = null;

    private String isLmgItem = null;

    private String itemId = null;

    @JsonProperty("excess_quantity")
    public BigDecimal getExcessQuantity() {
        return excessQuantity;
    }

    public void setExcessQuantity(BigDecimal excessQuantity) {
        this.excessQuantity = excessQuantity;
    }

    @JsonProperty("is_item_on_customer_order")
    public String getItemOnCustomerOrder() {
        return isItemOnCustomerOrder;
    }

    public void setItemOnCustomerOrder(String itemOnCustomerOrder) {
        isItemOnCustomerOrder = itemOnCustomerOrder;
    }

    @JsonProperty("is_lmg_item")
    public String getLmgItem() {
        return isLmgItem;
    }

    public void setLmgItem(String lmgItem) {
        isLmgItem = lmgItem;
    }

    @JsonProperty("item_id")
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("disposition_code")
    public String getDispositionCode() {
        return dispositionCode;
    }

    public void setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReturnExcessReqOrderLine)) return false;

        ReturnExcessReqOrderLine that = (ReturnExcessReqOrderLine) o;

        if (getDispositionCode() != null ?
                !getDispositionCode().equals(that.getDispositionCode()) : that.getDispositionCode() != null)
            return false;
        if (!Objects.equals(excessQuantity, that.excessQuantity))
            return false;
        if (!Objects.equals(isItemOnCustomerOrder, that.isItemOnCustomerOrder))
            return false;
        if (!Objects.equals(isLmgItem, that.isLmgItem)) return false;
        return Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dispositionCode, excessQuantity, isItemOnCustomerOrder, isLmgItem, itemId);
    }

    @Override
    public String toString() {
        return "ReturnExcessReqOrderLine{" +
                "dispositionCode='" + dispositionCode + '\'' +
                ", excessQuantity=" + excessQuantity +
                ", isItemOnCustomerOrder=" + isItemOnCustomerOrder +
                ", isLmgItem=" + isLmgItem +
                ", itemId='" + itemId + '\'' +
                '}';
    }
}
