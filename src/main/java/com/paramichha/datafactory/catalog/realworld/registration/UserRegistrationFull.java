package com.paramichha.datafactory.catalog.realworld.registration;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record UserRegistrationFull(
    @NotBlank @Email String email,
    @NotBlank @Size(min=2, max=50) String firstName,
    @NotBlank @Size(min=2, max=50) String lastName,
    @NotBlank @Size(min=8, max=100) String password,
    @Min(18) @Max(120) int age,
    @NotNull @Past LocalDate dateOfBirth,
    @NotBlank String phone,
    @NotBlank String country
) {}
