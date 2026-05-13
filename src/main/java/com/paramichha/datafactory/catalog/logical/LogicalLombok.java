package com.paramichha.datafactory.catalog.logical;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class LogicalLombok {
    @AssertTrue boolean active;
    @AssertTrue Boolean verified;
    @AssertFalse boolean deleted;
    @AssertFalse Boolean archived;
}
