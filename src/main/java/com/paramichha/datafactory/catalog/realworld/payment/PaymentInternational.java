package com.paramichha.datafactory.catalog.realworld.payment;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record PaymentInternational(
    @NotBlank String fromIban,
    @NotBlank String toIban,
    @NotBlank String bic,
    @NotNull @Positive BigDecimal amount,
    @NotBlank String currency,
    @NotBlank @Size(max=35) String reference
) {}
