package com.paramichha.datafactory.catalog.realworld.trading;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record Trade(
    @NotBlank String tradeId,
    @NotNull TradeSide side,
    @NotBlank String instrument,
    @NotNull @Positive BigDecimal quantity,
    @NotNull @Positive BigDecimal price,
    @NotNull TradeStatus status
) {}
