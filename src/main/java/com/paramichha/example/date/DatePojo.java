package com.paramichha.example.date;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class DatePojo {
    @NotNull @Past LocalDate dateOfBirth;
    @NotNull @FutureOrPresent LocalDate expiryDate;
     LocalDate optionalDate;
    public DatePojo() {}

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
    public LocalDate getOptionalDate() { return optionalDate; }
    public void setOptionalDate(LocalDate optionalDate) { this.optionalDate = optionalDate; };
}
