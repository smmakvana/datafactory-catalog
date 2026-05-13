package com.paramichha.datafactory.catalog.text;
import jakarta.validation.constraints.*;

public record TextRecord(@NotBlank @Size(min=1, max=100) String name, @NotBlank @Size(min=2, max=500) String description, String notes, char initial) {}
