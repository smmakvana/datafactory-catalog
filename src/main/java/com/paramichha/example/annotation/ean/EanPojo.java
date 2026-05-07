package com.paramichha.example.annotation.ean;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.EAN;

public class EanPojo {
    @NotBlank @EAN String barcode;
    @NotBlank String productName;
    public EanPojo() {}

    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; };
}
