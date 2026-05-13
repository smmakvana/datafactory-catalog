package com.paramichha.datafactory.catalog.annotation.isbn;
import jakarta.validation.constraints.*;

public record IsbnRecord(@NotBlank @org.hibernate.validator.constraints.ISBN String isbn, @NotBlank String title) {}
