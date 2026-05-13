package com.paramichha.datafactory.catalog.annotation.isbn;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.ISBN;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class IsbnAllArgs {    @NotBlank @ISBN String isbn;    @NotBlank String title;
}
