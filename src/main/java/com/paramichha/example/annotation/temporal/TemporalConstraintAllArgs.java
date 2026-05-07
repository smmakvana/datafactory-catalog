package com.paramichha.example.annotation.temporal;
import jakarta.validation.constraints.*;
import java.time.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class TemporalConstraintAllArgs {    @Past LocalDate dateOfBirth;;    @Future LocalDate expiryDate;;    @PastOrPresent LocalDateTime createdAt;;    @FutureOrPresent LocalDateTime scheduledAt;;
}
