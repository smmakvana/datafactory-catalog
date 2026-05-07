package com.paramichha.example.annotation.notnull;
import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class NotNullLombok {
    @NotNull String name;
    @NotNull Integer age;
    @NotNull UUID id;
    @NotNull LocalDate dob;
}
