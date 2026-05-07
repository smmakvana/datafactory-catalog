package com.paramichha.example.realworld.trading;


import com.paramichha.example.realworld.trading.support.TradeSide;
import com.paramichha.example.realworld.trading.support.TradeStatus;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;


public record RealWorldTrade(
        @NotBlank @Size(min = 1, max = 10) String symbol,
        @NotNull @Positive Integer quantity,
        @NotNull @Positive BigDecimal price,
        @NotNull TradeSide side,
        @NotNull TradeStatus status,
        @NotNull @Future LocalDate settlementDate
) {}
