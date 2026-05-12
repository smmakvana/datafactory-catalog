package com.paramichha.example.collection.set;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class SetAllArgs {
    @NotEmpty Set<String> roles;
    @Size(min=1, max=5) Set<String> tags;
    Set<Integer> scores;
}
