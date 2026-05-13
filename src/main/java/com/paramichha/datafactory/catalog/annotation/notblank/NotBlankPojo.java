package com.paramichha.datafactory.catalog.annotation.notblank;
import jakarta.validation.constraints.*;

public class NotBlankPojo {
    @NotBlank String username;
    @NotBlank String firstName;
    @NotBlank String lastName;
    public NotBlankPojo() {}

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; };
}
