package com.paramichha.datafactory.catalog.realworld.registration;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record UserRegistration(
    @NotBlank @Email String email,
    @NotBlank @Size(min=2, max=50) String fullName,
    @Min(18) @Max(120) int age,
    @NotNull @Past LocalDate dateOfBirth,
    @NotBlank @Size(min=8, max=100) String password
) {}
