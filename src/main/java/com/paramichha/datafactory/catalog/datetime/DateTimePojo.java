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
package com.paramichha.datafactory.catalog.datetime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

/**
 * DateTime fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @Future, @NotNull, @Past.
 */
public class DateTimePojo {
    @NotNull @Past java.time.LocalDateTime createdAt;

    @NotNull @Future java.time.ZonedDateTime scheduledAt;

    @NotNull java.time.Instant occurredAt;

    java.time.OffsetDateTime updatedAt;

    public DateTimePojo() {}

    public java.time.LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public java.time.ZonedDateTime getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(java.time.ZonedDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public java.time.Instant getOccurredAt() {
        return occurredAt;
    }

    public void setOccurredAt(java.time.Instant occurredAt) {
        this.occurredAt = occurredAt;
    }

    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    ;
}
