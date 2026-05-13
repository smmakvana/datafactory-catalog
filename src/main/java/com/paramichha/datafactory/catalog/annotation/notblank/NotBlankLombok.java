package com.paramichha.datafactory.catalog.annotation.notblank;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class NotBlankLombok {
    @NotBlank String username;
    @NotBlank String firstName;
    @NotBlank String lastName;
}
