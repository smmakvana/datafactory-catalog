package com.paramichha.datafactory.catalog.nested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

public class NestedPojo {
    @NotBlank String name;
    @NotNull @Valid Address address;
    @NotBlank String email;
    public NestedPojo() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; };
}
