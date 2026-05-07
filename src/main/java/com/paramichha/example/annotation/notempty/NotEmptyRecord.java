package com.paramichha.example.annotation.notempty;
import jakarta.validation.constraints.*;
import java.util.List;

public record NotEmptyRecord(@NotEmpty String name, @NotEmpty java.util.List<String> roles, @NotEmpty java.util.List<Integer> scores) {}
