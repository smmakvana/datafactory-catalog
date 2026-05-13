package com.paramichha.datafactory.catalog.date;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class DateAllArgs {    @NotNull @Past LocalDate dateOfBirth;    @NotNull @FutureOrPresent LocalDate expiryDate;    LocalDate optionalDate;
}
