package com.paramichha.datafactory.catalog.nested;
import jakarta.validation.constraints.*;

public record Address(
    @NotBlank String line1,
    @NotBlank String city,
    @NotBlank String postcode,
    @NotBlank String country
) {}
