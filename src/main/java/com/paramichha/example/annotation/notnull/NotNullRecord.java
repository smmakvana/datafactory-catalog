package com.paramichha.example.annotation.notnull;
import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;

public record NotNullRecord(@NotNull String name, @NotNull Integer age, @NotNull java.util.UUID id, @NotNull java.time.LocalDate dob) {}
