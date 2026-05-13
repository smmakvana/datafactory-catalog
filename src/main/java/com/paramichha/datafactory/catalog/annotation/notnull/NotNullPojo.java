package com.paramichha.datafactory.catalog.annotation.notnull;
import jakarta.validation.constraints.*;
import java.util.UUID;
import java.time.LocalDate;

public class NotNullPojo {
    @NotNull String name;
    @NotNull Integer age;
    @NotNull UUID id;
    @NotNull LocalDate dob;
    public NotNullPojo() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; };
}
