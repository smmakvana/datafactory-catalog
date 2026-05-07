package com.paramichha.example.annotation.notempty;
import jakarta.validation.constraints.*;
import java.util.List;

public class NotEmptyPojo {
    @NotEmpty String name;
    @NotEmpty List<String> roles;
    @NotEmpty List<Integer> scores;
    public NotEmptyPojo() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
    public List<Integer> getScores() { return scores; }
    public void setScores(List<Integer> scores) { this.scores = scores; };
}
