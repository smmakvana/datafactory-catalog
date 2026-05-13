package com.paramichha.datafactory.catalog.enumtype;
import jakarta.validation.constraints.*;

public class EnumPojo {
    @NotNull OrderStatus status;
     OrderStatus previousStatus;
    public EnumPojo() {}

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
    public OrderStatus getPreviousStatus() { return previousStatus; }
    public void setPreviousStatus(OrderStatus previousStatus) { this.previousStatus = previousStatus; };
}
