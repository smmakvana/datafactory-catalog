package com.paramichha.datafactory.catalog.date;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class DateLombok {
    @NotNull @Past LocalDate dateOfBirth;
    @NotNull @FutureOrPresent LocalDate expiryDate;
    LocalDate optionalDate;
}
