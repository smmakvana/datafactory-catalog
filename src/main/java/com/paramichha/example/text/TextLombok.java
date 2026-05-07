package com.paramichha.example.text;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class TextLombok {
    @NotBlank @Size(min=1, max=100) String name;
    @NotBlank @Size(min=2, max=500) String description;
    String notes;
    char initial;
}
