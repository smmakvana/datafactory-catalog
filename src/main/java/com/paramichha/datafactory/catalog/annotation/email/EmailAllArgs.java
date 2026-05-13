package com.paramichha.datafactory.catalog.annotation.email;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class EmailAllArgs {    @NotBlank @Email String email;    @Email String backupEmail;
}
