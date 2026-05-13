package com.paramichha.datafactory.catalog.annotation.combined;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class CombinedAllArgs {    @NotBlank @Email String email;    @NotBlank @Size(min=2, max=50) String name;    @Min(18) @Max(120) int age;    @NotNull @Past LocalDate dateOfBirth;    @NotNull @Positive BigDecimal balance;
}
