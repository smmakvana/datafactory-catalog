package com.paramichha.datafactory.catalog.realworld.payment;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record PaymentDomestic(
    @NotBlank String sortCode,
    @NotBlank String accountNumber,
    @NotNull @Positive BigDecimal amount,
    @NotBlank String reference
) {}
