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
package com.paramichha.datafactory.catalog.annotation.notnull;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * NotNull fixture: Lombok @Value class with an all-arguments constructor.
 *
 * <p>Constraints: @NotNull.
 */
@Value
@AllArgsConstructor
public class NotNullAllArgs {
    @NotNull String name;

    @NotNull Integer age;

    @NotNull UUID id;

    @NotNull LocalDate dob;
}
