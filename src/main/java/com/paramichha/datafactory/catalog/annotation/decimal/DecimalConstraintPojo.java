package com.paramichha.datafactory.catalog.annotation.decimal;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public class DecimalConstraintPojo {
    @DecimalMin("0.00") @DecimalMax("999.99") BigDecimal price;
    @Digits(integer=6, fraction=2) BigDecimal amount;
    public DecimalConstraintPojo() {}

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; };
}
