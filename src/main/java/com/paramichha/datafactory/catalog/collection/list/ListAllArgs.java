package com.paramichha.datafactory.catalog.collection.list;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class ListAllArgs {    @NotEmpty List<String> roles;    @Size(min=1, max=5) List<String> tags;    List<Integer> scores;    Collection<String> labels;
}
