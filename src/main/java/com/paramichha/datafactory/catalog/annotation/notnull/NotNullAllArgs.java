package com.paramichha.datafactory.catalog.annotation.notnull;
import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class NotNullAllArgs {    @NotNull String name;    @NotNull Integer age;    @NotNull UUID id;    @NotNull LocalDate dob;
}
