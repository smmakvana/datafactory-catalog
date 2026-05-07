package com.paramichha.example.annotation.notblank;
import jakarta.validation.constraints.*;

public record NotBlankRecord(@NotBlank String username, @NotBlank String firstName, @NotBlank String lastName) {}
