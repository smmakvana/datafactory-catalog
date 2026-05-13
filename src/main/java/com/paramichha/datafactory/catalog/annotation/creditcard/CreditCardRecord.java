package com.paramichha.datafactory.catalog.annotation.creditcard;
import jakarta.validation.constraints.*;

public record CreditCardRecord(@NotBlank @org.hibernate.validator.constraints.CreditCardNumber String cardNumber, @NotBlank String cardHolder) {}
