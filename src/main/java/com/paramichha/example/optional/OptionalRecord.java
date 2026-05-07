package com.paramichha.example.optional;
import jakarta.validation.constraints.*;
import java.util.Optional;

public record OptionalRecord(@NotBlank String required, Optional<String> nickname, Optional<Integer> age) {}
