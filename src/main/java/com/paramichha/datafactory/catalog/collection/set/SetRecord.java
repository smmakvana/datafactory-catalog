package com.paramichha.datafactory.catalog.collection.set;
import jakarta.validation.constraints.*;
import java.util.*;

public record SetRecord(
    @NotEmpty Set<String> roles,
    @Size(min=1, max=5) Set<String> tags,
    Set<Integer> scores
) {}
