package com.paramichha.example.annotation.numeric;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class NumericConstraintLombok {
    @Min(1) @Max(100) int quantity;
    @Positive Long id;
    @PositiveOrZero Integer score;
    @Negative Integer debt;
    @NegativeOrZero Long adjustment;
}
