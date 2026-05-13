package com.paramichha.datafactory.catalog.text;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class TextAllArgs {    @NotBlank @Size(min=1, max=100) String name;    @NotBlank @Size(min=2, max=500) String description;    String notes;    char initial;
}
