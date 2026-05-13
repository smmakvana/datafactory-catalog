package com.paramichha.datafactory.catalog.date;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record DateRecord(@NotNull @Past LocalDate dateOfBirth, @NotNull @FutureOrPresent LocalDate expiryDate, LocalDate optionalDate) {}
