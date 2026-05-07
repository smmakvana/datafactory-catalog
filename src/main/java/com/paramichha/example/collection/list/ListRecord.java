package com.paramichha.example.collection.list;
import jakarta.validation.constraints.*;
import java.util.*;

public record ListRecord(@NotEmpty java.util.List<String> roles, @Size(min=1, max=5) java.util.List<String> tags, java.util.List<Integer> scores, java.util.Collection<String> labels) {}
