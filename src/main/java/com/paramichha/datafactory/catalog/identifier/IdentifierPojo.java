package com.paramichha.datafactory.catalog.identifier;
import jakarta.validation.constraints.*;
import java.util.UUID;

public class IdentifierPojo {
    @NotNull UUID id;
    @NotNull UUID correlationId;
     UUID parentId;
    public IdentifierPojo() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public UUID getCorrelationId() { return correlationId; }
    public void setCorrelationId(UUID correlationId) { this.correlationId = correlationId; }
    public UUID getParentId() { return parentId; }
    public void setParentId(UUID parentId) { this.parentId = parentId; };
}
