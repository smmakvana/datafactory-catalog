package com.paramichha.datafactory.catalog.optional;
import jakarta.validation.constraints.*;
import java.util.Optional;

public class OptionalPojo {
    @NotBlank String required;
     Optional<String> nickname;
     Optional<Integer> age;
    public OptionalPojo() {}

    public String getRequired() { return required; }
    public void setRequired(String required) { this.required = required; }
    public Optional<String> getNickname() { return nickname; }
    public void setNickname(Optional<String> nickname) { this.nickname = nickname; }
    public Optional<Integer> getAge() { return age; }
    public void setAge(Optional<Integer> age) { this.age = age; };
}
