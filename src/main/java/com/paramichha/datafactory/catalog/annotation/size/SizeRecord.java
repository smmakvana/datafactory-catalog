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
package com.paramichha.datafactory.catalog.annotation.size;

import jakarta.validation.constraints.Size;

/**
 * Size fixture: Java record.
 *
 * <p>Constraints: @Size.
 */
public record SizeRecord(
        @Size(min = 2, max = 50) String name,
        @Size(min = 8, max = 100) String password,
        @Size(min = 1, max = 10) java.util.List<String> tags) {}
