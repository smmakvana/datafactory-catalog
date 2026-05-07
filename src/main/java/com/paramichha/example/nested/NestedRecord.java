package com.paramichha.example.nested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

public record NestedRecord(@NotBlank String name, @NotNull @Valid Address address, @NotBlank String email) {}
