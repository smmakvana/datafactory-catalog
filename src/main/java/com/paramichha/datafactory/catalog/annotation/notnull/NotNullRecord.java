package com.paramichha.datafactory.catalog.annotation.notnull;
import jakarta.validation.constraints.*;

public record NotNullRecord(@NotNull String name, @NotNull Integer age, @NotNull java.util.UUID id, @NotNull java.time.LocalDate dob) {}
