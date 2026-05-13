package com.paramichha.datafactory.catalog.annotation.creditcard;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.CreditCardNumber;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class CreditCardLombok {
    @NotBlank @CreditCardNumber String cardNumber;
    @NotBlank String cardHolder;
}
