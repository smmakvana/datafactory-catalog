package com.paramichha.example.collection.list;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class ListLombok {
    @NotEmpty List<String> roles;
    @Size(min=1, max=5) List<String> tags;
    List<Integer> scores;
    Collection<String> labels;
}
