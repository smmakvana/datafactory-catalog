package com.paramichha.datafactory.catalog.collection.array;
import jakarta.validation.constraints.*;

public record ArrayRecord(
    @NotNull String[] names,
    @NotNull int[] scores,
    String[] tags
) {}
