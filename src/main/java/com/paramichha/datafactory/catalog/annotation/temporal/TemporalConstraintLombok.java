package com.paramichha.datafactory.catalog.annotation.temporal;
import jakarta.validation.constraints.*;
import java.time.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class TemporalConstraintLombok {
    @Past LocalDate dateOfBirth;
    @Future LocalDate expiryDate;
    @PastOrPresent LocalDateTime createdAt;
    @FutureOrPresent LocalDateTime scheduledAt;
}
