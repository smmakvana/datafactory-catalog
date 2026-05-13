package com.paramichha.datafactory.catalog.timepart;
import jakarta.validation.constraints.*;
import java.time.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class TimePartLombok {
    @NotNull Year graduationYear;
    @NotNull YearMonth expiryMonth;
    @NotNull LocalTime openTime;
    LocalTime closeTime;
}
