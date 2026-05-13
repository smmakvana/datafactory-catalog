package com.paramichha.datafactory.catalog.nested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class NestedAllArgs {    @NotBlank String name;    @NotNull @Valid Address address;    @NotBlank String email;
}
