package com.paramichha.example.annotation.pattern;
import jakarta.validation.constraints.*;

public class PatternPojo {
    @Pattern(regexp="[A-Z]{2}\\d{4}") String reference;
    @Pattern(regexp="\\d{2}/\\d{2}") String expiryDate;
    public PatternPojo() {}

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; };
}
