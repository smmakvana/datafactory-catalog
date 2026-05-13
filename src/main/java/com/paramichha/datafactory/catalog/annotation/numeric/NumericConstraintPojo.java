package com.paramichha.datafactory.catalog.annotation.numeric;
import jakarta.validation.constraints.*;

public class NumericConstraintPojo {
    @Min(1) @Max(100) int quantity;
    @Positive Long id;
    @PositiveOrZero Integer score;
    @Negative Integer debt;
    @NegativeOrZero Long adjustment;
    public NumericConstraintPojo() {}

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }
    public Integer getDebt() { return debt; }
    public void setDebt(Integer debt) { this.debt = debt; }
    public Long getAdjustment() { return adjustment; }
    public void setAdjustment(Long adjustment) { this.adjustment = adjustment; };
}
