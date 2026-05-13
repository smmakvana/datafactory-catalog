package com.paramichha.datafactory.catalog.annotation.ean;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.EAN;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class EanAllArgs {    @NotBlank @EAN String barcode;    @NotBlank String productName;
}
