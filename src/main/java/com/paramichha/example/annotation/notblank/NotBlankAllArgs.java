package com.paramichha.example.annotation.notblank;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class NotBlankAllArgs {    @NotBlank String username;    @NotBlank String firstName;    @NotBlank String lastName;
}
