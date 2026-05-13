package com.paramichha.datafactory.catalog.annotation.assertbool;
import jakarta.validation.constraints.*;

public record AssertBoolRecord(@AssertTrue boolean active, @AssertFalse boolean deleted) {}
