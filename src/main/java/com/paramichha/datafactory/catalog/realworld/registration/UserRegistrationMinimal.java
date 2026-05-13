package com.paramichha.datafactory.catalog.realworld.registration;
import jakarta.validation.constraints.*;

public record UserRegistrationMinimal(
    @NotBlank @Email String email,
    @NotBlank @Size(min=8) String password
) {}
