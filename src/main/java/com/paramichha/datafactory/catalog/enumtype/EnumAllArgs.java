package com.paramichha.datafactory.catalog.enumtype;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class EnumAllArgs {    @NotNull OrderStatus status;    OrderStatus previousStatus;
}
