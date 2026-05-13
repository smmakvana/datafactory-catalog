package com.paramichha.datafactory.catalog.annotation.isbn;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.ISBN;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class IsbnLombok {
    @NotBlank @ISBN String isbn;
    @NotBlank String title;
}
