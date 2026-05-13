package com.paramichha.datafactory.catalog.enumtype;
import jakarta.validation.constraints.*;

public record EnumRecord(@NotNull OrderStatus status, OrderStatus previousStatus) {}
