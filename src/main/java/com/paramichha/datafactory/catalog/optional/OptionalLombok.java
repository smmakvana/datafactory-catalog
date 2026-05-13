package com.paramichha.datafactory.catalog.optional;
import jakarta.validation.constraints.*;
import java.util.Optional;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class OptionalLombok {
    @NotBlank String required;
    Optional<String> nickname;
    Optional<Integer> age;
}
