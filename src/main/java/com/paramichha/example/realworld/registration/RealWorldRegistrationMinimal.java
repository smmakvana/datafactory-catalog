package com.paramichha.example.realworld.registration;


import jakarta.validation.constraints.*;


public record RealWorldRegistrationMinimal(
        @NotBlank @Email String email,
        @NotBlank @Size(min = 8) String password
) {}
