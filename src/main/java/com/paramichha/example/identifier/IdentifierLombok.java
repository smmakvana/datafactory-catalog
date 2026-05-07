package com.paramichha.example.identifier;
import jakarta.validation.constraints.*;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class IdentifierLombok {
    @NotNull UUID id;
    @NotNull UUID correlationId;
    UUID parentId;
}
