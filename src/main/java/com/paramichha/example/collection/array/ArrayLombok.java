package com.paramichha.example.collection.array;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class ArrayLombok {
    @NotNull String[] names;
    @NotNull int[] scores;
    String[] tags;
}
