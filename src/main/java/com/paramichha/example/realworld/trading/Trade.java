package com.paramichha.example.realworld.trading;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.math.BigDecimal;

public record Trade(
    @NotBlank String tradeId,
    @NotNull TradeSide side,
    @NotBlank String instrument,
    @NotNull @Positive BigDecimal quantity,
    @NotNull @Positive BigDecimal price,
    @NotNull TradeStatus status
) {}
