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
package com.paramichha.datafactory.catalog.number;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

/**
 * Number fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @Max, @Min, @Negative, @NegativeOrZero, @Positive, @PositiveOrZero.
 */
public class NumberPojo {
    @Min(1) @Max(127) byte tier;

    @Min(0) @Max(30000) short port;

    @Min(0) @Max(99999) int quantity;

    @Positive Long id;

    @PositiveOrZero Integer score;

    @Negative Integer debt;

    @NegativeOrZero Long adjustment;

    public NumberPojo() {}

    public byte getTier() {
        return tier;
    }

    public void setTier(byte tier) {
        this.tier = tier;
    }

    public short getPort() {
        return port;
    }

    public void setPort(short port) {
        this.port = port;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    public Long getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(Long adjustment) {
        this.adjustment = adjustment;
    }
    ;
}
