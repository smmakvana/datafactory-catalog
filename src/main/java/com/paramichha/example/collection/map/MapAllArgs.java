package com.paramichha.example.collection.map;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class MapAllArgs {
    @NotEmpty Map<String, String> headers;
    @Size(min=1, max=10) Map<String, Integer> scores;
    Map<String, Object> metadata;
}
