package com.paramichha.datafactory.catalog.annotation.temporal;
import jakarta.validation.constraints.*;

public record TemporalConstraintRecord(@Past java.time.LocalDate dateOfBirth, @Future java.time.LocalDate expiryDate, @PastOrPresent java.time.LocalDateTime createdAt, @FutureOrPresent java.time.LocalDateTime scheduledAt) {}
