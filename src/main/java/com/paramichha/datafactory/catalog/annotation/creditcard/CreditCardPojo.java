/*
 * Copyright 2026 Sanjay Makvana
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paramichha.datafactory.catalog.annotation.creditcard;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.CreditCardNumber;

/**
 * CreditCard fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotBlank.
 */
public class CreditCardPojo {
  @NotBlank @CreditCardNumber String cardNumber;
  @NotBlank String cardHolder;

  public CreditCardPojo() {}

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
  }
  ;
}
