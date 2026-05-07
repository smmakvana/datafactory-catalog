package com.paramichha.example.datetime;
import jakarta.validation.constraints.*;
import java.time.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class DateTimeAllArgs {    @NotNull @Past java.time.LocalDateTime createdAt;    @NotNull @Future java.time.ZonedDateTime scheduledAt;    @NotNull java.time.Instant occurredAt;    java.time.OffsetDateTime updatedAt;
}
