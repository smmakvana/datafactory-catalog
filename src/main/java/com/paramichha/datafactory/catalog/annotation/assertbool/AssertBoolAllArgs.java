package com.paramichha.datafactory.catalog.annotation.assertbool;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class AssertBoolAllArgs {    @AssertTrue boolean active;    @AssertFalse boolean deleted;
}
