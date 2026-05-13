package com.paramichha.datafactory.catalog.collection.array;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class ArrayAllArgs {
    @NotNull String[] names;
    @NotNull int[] scores;
    String[] tags;
}
