package com.paramichha.datafactory.catalog.annotation.pattern;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class PatternLombok {
    @Pattern(regexp="[A-Z]{2}\\d{4}") String reference;
    @Pattern(regexp="\\d{2}/\\d{2}") String expiryDate;
}
