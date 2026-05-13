package com.paramichha.datafactory.catalog.annotation.email;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class EmailLombok {
    @NotBlank @Email String email;
    @Email String backupEmail;
}
