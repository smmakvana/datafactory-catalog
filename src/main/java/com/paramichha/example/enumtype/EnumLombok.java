package com.paramichha.example.enumtype;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class EnumLombok {
    @NotNull OrderStatus status;
    OrderStatus previousStatus;
}
