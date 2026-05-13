package com.paramichha.datafactory.catalog.realworld.address;
import jakarta.validation.constraints.*;

public record PostalAddress(
    @NotBlank String line1,
    String line2,
    @NotBlank String city,
    @NotBlank String postcode,
    @NotBlank @Size(min=2, max=2) String countryCode
) {}
