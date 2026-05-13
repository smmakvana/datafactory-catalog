package com.paramichha.datafactory.catalog.annotation.pattern;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class PatternAllArgs {    @Pattern(regexp="[A-Z]{2}\\d{4}") String reference;    @Pattern(regexp="\\d{2}/\\d{2}") String expiryDate;
}
