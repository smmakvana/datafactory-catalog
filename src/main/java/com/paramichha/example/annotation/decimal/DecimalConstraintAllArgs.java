package com.paramichha.example.annotation.decimal;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class DecimalConstraintAllArgs {    @DecimalMin("0.00") @DecimalMax("999.99") BigDecimal price;    @Digits(integer=6, fraction=2) BigDecimal amount;
}
