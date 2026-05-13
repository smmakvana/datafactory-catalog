package com.paramichha.datafactory.catalog.optional;
import jakarta.validation.constraints.*;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class OptionalAllArgs {    @NotBlank String required;    Optional<String> nickname;    Optional<Integer> age;
}
