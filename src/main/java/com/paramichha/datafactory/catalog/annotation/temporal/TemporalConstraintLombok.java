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
package com.paramichha.datafactory.catalog.annotation.temporal;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;

/**
 * TemporalConstraint fixture: Lombok class with @Value and @Builder.
 *
 * <p>Constraints: @Future, @FutureOrPresent, @Past, @PastOrPresent.
 */
@Value
@Builder
public class TemporalConstraintLombok {
  @Past LocalDate dateOfBirth;
  @Future LocalDate expiryDate;
  @PastOrPresent LocalDateTime createdAt;
  @FutureOrPresent LocalDateTime scheduledAt;
}
