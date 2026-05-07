package com.paramichha.example.annotation.combined;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;

public class CombinedPojo {
    @NotBlank @Email String email;
    @NotBlank @Size(min=2, max=50) String name;
    @Min(18) @Max(120) int age;
    @NotNull @Past LocalDate dateOfBirth;
    @NotNull @Positive BigDecimal balance;
    public CombinedPojo() {}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; };
}
