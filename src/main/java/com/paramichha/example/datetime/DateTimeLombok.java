package com.paramichha.example.datetime;
import jakarta.validation.constraints.*;
import java.time.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class DateTimeLombok {
    @NotNull @Past java.time.LocalDateTime createdAt;
    @NotNull @Future java.time.ZonedDateTime scheduledAt;
    @NotNull java.time.Instant occurredAt;
    java.time.OffsetDateTime updatedAt;
}
