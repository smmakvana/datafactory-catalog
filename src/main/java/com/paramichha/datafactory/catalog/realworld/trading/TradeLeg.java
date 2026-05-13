package com.paramichha.datafactory.catalog.realworld.trading;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record TradeLeg(
    @NotNull TradeSide side,
    @NotBlank String instrument,
    @NotNull @Positive BigDecimal quantity,
    @NotNull @Positive BigDecimal price
) {}
