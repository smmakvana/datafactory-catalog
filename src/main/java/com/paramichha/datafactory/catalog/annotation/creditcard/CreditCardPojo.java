package com.paramichha.datafactory.catalog.annotation.creditcard;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.CreditCardNumber;

public class CreditCardPojo {
    @NotBlank @CreditCardNumber String cardNumber;
    @NotBlank String cardHolder;
    public CreditCardPojo() {}

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public String getCardHolder() { return cardHolder; }
    public void setCardHolder(String cardHolder) { this.cardHolder = cardHolder; };
}
