package com.paramichha.example.enumtype;
import jakarta.validation.constraints.*;

public record EnumRecord(@NotNull OrderStatus status, OrderStatus previousStatus) {}
