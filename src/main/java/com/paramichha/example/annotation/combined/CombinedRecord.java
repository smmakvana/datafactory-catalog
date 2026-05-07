package com.paramichha.example.annotation.combined;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;

public record CombinedRecord(@NotBlank @Email String email, @NotBlank @Size(min=2, max=50) String name, @Min(18) @Max(120) int age, @NotNull @Past java.time.LocalDate dateOfBirth, @NotNull @Positive java.math.BigDecimal balance) {}
