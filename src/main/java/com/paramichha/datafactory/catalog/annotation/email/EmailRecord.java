package com.paramichha.datafactory.catalog.annotation.email;
import jakarta.validation.constraints.*;

public record EmailRecord(@NotBlank @Email String email, @Email String backupEmail) {}
