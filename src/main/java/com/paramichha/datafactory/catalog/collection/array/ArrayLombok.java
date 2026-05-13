package com.paramichha.datafactory.catalog.collection.array;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class ArrayLombok {
    @NotNull String[] names;
    @NotNull int[] scores;
    String[] tags;
}
