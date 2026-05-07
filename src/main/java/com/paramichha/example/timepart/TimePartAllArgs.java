package com.paramichha.example.timepart;
import jakarta.validation.constraints.*;
import java.time.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class TimePartAllArgs {    @NotNull Year graduationYear;    @NotNull YearMonth expiryMonth;    @NotNull LocalTime openTime;    LocalTime closeTime;
}
