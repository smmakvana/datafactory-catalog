package com.paramichha.example.logical;
import jakarta.validation.constraints.*;

public record LogicalRecord(@AssertTrue boolean active, @AssertTrue Boolean verified, @AssertFalse boolean deleted, @AssertFalse Boolean archived) {}
