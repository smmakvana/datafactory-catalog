package com.paramichha.example.timepart;
import jakarta.validation.constraints.*;
import java.time.*;

public record TimePartRecord(@NotNull Year graduationYear, @NotNull YearMonth expiryMonth, @NotNull LocalTime openTime, LocalTime closeTime) {}
