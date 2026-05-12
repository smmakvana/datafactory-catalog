package com.paramichha.example.collection.array;
import jakarta.validation.constraints.*;
import java.util.*;

public record ArrayRecord(
    @NotNull String[] names,
    @NotNull int[] scores,
    String[] tags
) {}
