package com.paramichha.datafactory.catalog.annotation.numeric;
import jakarta.validation.constraints.*;

public record NumericConstraintRecord(@Min(1) @Max(100) int quantity, @Positive Long id, @PositiveOrZero Integer score, @Negative Integer debt, @NegativeOrZero Long adjustment) {}
