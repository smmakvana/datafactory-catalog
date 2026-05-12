package com.paramichha.example.annotation.assertbool;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class AssertBoolLombok {
    @AssertTrue boolean active;
    @AssertFalse boolean deleted;
}
