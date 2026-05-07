package com.paramichha.example.annotation.creditcard;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.CreditCardNumber;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class CreditCardAllArgs {    @NotBlank @CreditCardNumber String cardNumber;;    @NotBlank String cardHolder;;
}
