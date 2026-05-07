package com.paramichha.example.realworld.payment;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;


public record RealWorldPaymentDomestic(
        @NotBlank @Size(min = 6, max = 6) String sortCode,
        @NotBlank @Size(min = 8, max = 8) String accountNumber,
        @NotNull @Positive BigDecimal amount,
        @NotBlank @Size(max = 18) String reference
) {}
