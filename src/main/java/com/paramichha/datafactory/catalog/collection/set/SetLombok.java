package com.paramichha.datafactory.catalog.collection.set;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class SetLombok {
    @NotEmpty Set<String> roles;
    @Size(min=1, max=5) Set<String> tags;
    Set<Integer> scores;
}
