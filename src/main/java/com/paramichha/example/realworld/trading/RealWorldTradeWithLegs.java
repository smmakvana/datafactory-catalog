package com.paramichha.example.realworld.trading;


import com.paramichha.example.realworld.trading.support.TradeLeg;
import com.paramichha.example.realworld.trading.support.TradeStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.List;


public record RealWorldTradeWithLegs(
        @NotBlank @Size(max = 50) String tradeId,
        @NotNull @Positive BigDecimal totalValue,
        @NotNull TradeStatus status,
        @NotNull @Size(min = 1) @Valid List<TradeLeg> legs
) {
}
