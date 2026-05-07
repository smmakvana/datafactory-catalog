package com.paramichha.example.annotation.ean;
import jakarta.validation.constraints.*;

public record EanRecord(@NotBlank @org.hibernate.validator.constraints.EAN String barcode, @NotBlank String productName) {}
