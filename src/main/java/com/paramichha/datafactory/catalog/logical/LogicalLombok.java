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
package com.paramichha.datafactory.catalog.logical;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;
import lombok.Builder;
import lombok.Value;

/**
 * Logical fixture: Lombok class with @Value and @Builder.
 *
 * <p>Constraints: @AssertFalse, @AssertTrue.
 */
@Value
@Builder
public class LogicalLombok {
  @AssertTrue boolean active;
  @AssertTrue Boolean verified;
  @AssertFalse boolean deleted;
  @AssertFalse Boolean archived;
}
