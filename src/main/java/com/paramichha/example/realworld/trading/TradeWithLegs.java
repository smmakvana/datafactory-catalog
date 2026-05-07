package com.paramichha.example.realworld.trading;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;

public record TradeWithLegs(
    @NotBlank String tradeId,
    @NotNull @Size(min=1) @Valid List<TradeLeg> legs,
    @NotNull TradeStatus status
) {}
