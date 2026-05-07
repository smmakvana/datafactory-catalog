package com.paramichha.example.realworld.payment;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record Payment(
    @NotBlank String fromIban,
    @NotBlank String toIban,
    @NotNull @Positive BigDecimal amount,
    @NotBlank @Size(max=35) String reference
) {}
