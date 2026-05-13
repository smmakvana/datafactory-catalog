package com.paramichha.datafactory.catalog.datetime;
import jakarta.validation.constraints.*;

public class DateTimePojo {
    @NotNull @Past java.time.LocalDateTime createdAt;
    @NotNull @Future java.time.ZonedDateTime scheduledAt;
    @NotNull java.time.Instant occurredAt;
     java.time.OffsetDateTime updatedAt;
    public DateTimePojo() {}

    public java.time.LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(java.time.LocalDateTime createdAt) { this.createdAt = createdAt; }
    public java.time.ZonedDateTime getScheduledAt() { return scheduledAt; }
    public void setScheduledAt(java.time.ZonedDateTime scheduledAt) { this.scheduledAt = scheduledAt; }
    public java.time.Instant getOccurredAt() { return occurredAt; }
    public void setOccurredAt(java.time.Instant occurredAt) { this.occurredAt = occurredAt; }
    public java.time.OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) { this.updatedAt = updatedAt; };
}
