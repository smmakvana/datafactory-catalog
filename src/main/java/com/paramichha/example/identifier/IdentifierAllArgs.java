package com.paramichha.example.identifier;
import jakarta.validation.constraints.*;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class IdentifierAllArgs {    @NotNull UUID id;    @NotNull UUID correlationId;    UUID parentId;
}
