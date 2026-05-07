package com.paramichha.example.realworld.payment;


import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;


public record RealWorldPaymentInternational(
        @NotBlank @Size(min = 15, max = 34) String senderIban,
        @NotBlank @Size(min = 15, max = 34) String receiverIban,
        @NotNull @Positive @DecimalMax("1000000.00") BigDecimal amount,
        @NotBlank @Size(min = 8, max = 11) String swiftBic,
        @NotBlank @Size(min = 3, max = 3) String currency,
        @NotBlank @Size(min = 2, max = 3) String destinationCountry,
        @NotNull @Future LocalDate valueDate,
        @NotBlank @Size(max = 140) String reference,
        @Size(max = 35) String remittanceInfo
) {}
