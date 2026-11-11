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
package com.paramichha.datafactory.catalog.decimal;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Decimal fixture: Lombok @Value class with an all-arguments constructor.
 *
 * <p>Constraints: @DecimalMax, @DecimalMin, @Digits, @NotBlank, @NotNull, @Positive, @PositiveOrZero.
 */
@Value
@AllArgsConstructor
public class DecimalAllArgs {
    @NotNull @DecimalMin("0.00") @DecimalMax("999999.99") BigDecimal price;

    @NotNull @Digits(integer = 8, fraction = 2) BigDecimal amount;

    @NotNull @Positive BigDecimal tax;

    @NotNull @PositiveOrZero Double rating;

    @NotNull @DecimalMin("0.0") @DecimalMax("1.0") Double probability;

    @NotBlank @DecimalMin("0.01") String minAmount;
}
