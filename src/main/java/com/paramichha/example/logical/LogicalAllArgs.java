package com.paramichha.example.logical;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class LogicalAllArgs {    @AssertTrue boolean active;    @AssertTrue Boolean verified;    @AssertFalse boolean deleted;    @AssertFalse Boolean archived;
}
