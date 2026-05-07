package com.paramichha.example.annotation.temporal;
import jakarta.validation.constraints.*;
import java.time.*;

public class TemporalConstraintPojo {
    @Past LocalDate dateOfBirth;
    @Future LocalDate expiryDate;
    @PastOrPresent LocalDateTime createdAt;
    @FutureOrPresent LocalDateTime scheduledAt;
    public TemporalConstraintPojo() {}

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getScheduledAt() { return scheduledAt; }
    public void setScheduledAt(LocalDateTime scheduledAt) { this.scheduledAt = scheduledAt; };
}
