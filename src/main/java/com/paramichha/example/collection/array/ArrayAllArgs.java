package com.paramichha.example.collection.array;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class ArrayAllArgs {
    @NotNull String[] names;
    @NotNull int[] scores;
    String[] tags;
}
