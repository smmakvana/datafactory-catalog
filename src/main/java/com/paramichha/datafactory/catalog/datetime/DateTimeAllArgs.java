package com.paramichha.datafactory.catalog.datetime;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class DateTimeAllArgs {    @NotNull @Past java.time.LocalDateTime createdAt;    @NotNull @Future java.time.ZonedDateTime scheduledAt;    @NotNull java.time.Instant occurredAt;    java.time.OffsetDateTime updatedAt;
}
