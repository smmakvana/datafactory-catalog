package com.paramichha.example.annotation.temporal;
import jakarta.validation.constraints.*;
import java.time.*;

public record TemporalConstraintRecord(@Past java.time.LocalDate dateOfBirth, @Future java.time.LocalDate expiryDate, @PastOrPresent java.time.LocalDateTime createdAt, @FutureOrPresent java.time.LocalDateTime scheduledAt) {}
