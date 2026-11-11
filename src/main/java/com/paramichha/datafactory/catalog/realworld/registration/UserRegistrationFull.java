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
package com.paramichha.datafactory.catalog.realworld.registration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

/**
 * UserRegistrationFull fixture: Java record.
 *
 * <p>Constraints: @Email, @Max, @Min, @NotBlank, @NotNull, @Past, @Size.
 */
public record UserRegistrationFull(
        @NotBlank @Email String email,
        @NotBlank @Size(min = 2, max = 50) String firstName,
        @NotBlank @Size(min = 2, max = 50) String lastName,
        @NotBlank @Size(min = 8, max = 100) String password,
        @Min(18) @Max(120) int age,
        @NotNull @Past LocalDate dateOfBirth,
        @NotBlank String phone,
        @NotBlank String country) {}
