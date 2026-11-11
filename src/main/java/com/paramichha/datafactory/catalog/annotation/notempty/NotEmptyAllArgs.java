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
package com.paramichha.datafactory.catalog.annotation.notempty;

import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * NotEmpty fixture: Lombok @Value class with an all-arguments constructor.
 *
 * <p>Constraints: @NotEmpty.
 */
@Value
@AllArgsConstructor
public class NotEmptyAllArgs {
    @NotEmpty String name;

    @NotEmpty List<String> roles;

    @NotEmpty List<Integer> scores;
}
