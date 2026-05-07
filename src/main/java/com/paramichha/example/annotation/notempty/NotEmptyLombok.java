package com.paramichha.example.annotation.notempty;
import jakarta.validation.constraints.*;
import java.util.List;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class NotEmptyLombok {
    @NotEmpty String name;
    @NotEmpty List<String> roles;
    @NotEmpty List<Integer> scores;
}
