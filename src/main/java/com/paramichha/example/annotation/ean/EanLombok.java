package com.paramichha.example.annotation.ean;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.EAN;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class EanLombok {
    @NotBlank @EAN String barcode;
    @NotBlank String productName;
}
