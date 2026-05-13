package com.paramichha.datafactory.catalog.nested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class NestedLombok {
    @NotBlank String name;
    @NotNull @Valid Address address;
    @NotBlank String email;
}
