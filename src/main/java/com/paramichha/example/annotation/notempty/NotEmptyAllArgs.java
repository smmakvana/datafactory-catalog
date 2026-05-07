package com.paramichha.example.annotation.notempty;
import jakarta.validation.constraints.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class NotEmptyAllArgs {    @NotEmpty String name;    @NotEmpty List<String> roles;    @NotEmpty List<Integer> scores;
}
