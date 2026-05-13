package com.paramichha.datafactory.catalog.collection.map;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class MapLombok {
    @NotEmpty Map<String, String> headers;
    @Size(min=1, max=10) Map<String, Integer> scores;
    Map<String, Object> metadata;
}
