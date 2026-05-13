package com.paramichha.datafactory.catalog.identifier;
import jakarta.validation.constraints.*;
import java.util.UUID;

public record IdentifierRecord(@NotNull UUID id, @NotNull UUID correlationId, UUID parentId) {}
