package com.paramichha.example.annotation.isbn;
import jakarta.validation.constraints.*;

public record IsbnRecord(@NotBlank @org.hibernate.validator.constraints.ISBN String isbn, @NotBlank String title) {}
