package com.paramichha.example.annotation.email;
import jakarta.validation.constraints.*;

public record EmailRecord(@NotBlank @Email String email, @Email String backupEmail) {}
