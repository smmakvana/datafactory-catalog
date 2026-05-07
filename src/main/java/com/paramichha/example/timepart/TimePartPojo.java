package com.paramichha.example.timepart;
import jakarta.validation.constraints.*;
import java.time.*;

public class TimePartPojo {
    @NotNull Year graduationYear;
    @NotNull YearMonth expiryMonth;
    @NotNull LocalTime openTime;
     LocalTime closeTime;
    public TimePartPojo() {}

    public Year getGraduationYear() { return graduationYear; }
    public void setGraduationYear(Year graduationYear) { this.graduationYear = graduationYear; }
    public YearMonth getExpiryMonth() { return expiryMonth; }
    public void setExpiryMonth(YearMonth expiryMonth) { this.expiryMonth = expiryMonth; }
    public LocalTime getOpenTime() { return openTime; }
    public void setOpenTime(LocalTime openTime) { this.openTime = openTime; }
    public LocalTime getCloseTime() { return closeTime; }
    public void setCloseTime(LocalTime closeTime) { this.closeTime = closeTime; };
}
