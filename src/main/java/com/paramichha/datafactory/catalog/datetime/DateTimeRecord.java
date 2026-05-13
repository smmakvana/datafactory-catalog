package com.paramichha.datafactory.catalog.datetime;
import jakarta.validation.constraints.*;

public record DateTimeRecord(@NotNull @Past java.time.LocalDateTime createdAt, @NotNull @Future java.time.ZonedDateTime scheduledAt, @NotNull java.time.Instant occurredAt, java.time.OffsetDateTime updatedAt) {}
