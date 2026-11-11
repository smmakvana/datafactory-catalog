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
 * DateTime fixture: Java record.
 *
 * <p>Constraints: @Future, @NotNull, @Past.
 */
public record DateTimeRecord(
        @NotNull @Past java.time.LocalDateTime createdAt,
        @NotNull @Future java.time.ZonedDateTime scheduledAt,
        @NotNull java.time.Instant occurredAt,
        java.time.OffsetDateTime updatedAt) {}
