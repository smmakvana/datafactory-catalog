package com.paramichha.datafactory.catalog.annotation.notempty;
import jakarta.validation.constraints.*;

public record NotEmptyRecord(@NotEmpty String name, @NotEmpty java.util.List<String> roles, @NotEmpty java.util.List<Integer> scores) {}
