package com.paramichha.datafactory.catalog.collection.set;
import jakarta.validation.constraints.*;
import java.util.*;

public class SetPojo {
    @NotEmpty Set<String> roles;
    @Size(min=1, max=5) Set<String> tags;
    Set<Integer> scores;
    public SetPojo() {}
    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }
    public Set<String> getTags() { return tags; }
    public void setTags(Set<String> tags) { this.tags = tags; }
    public Set<Integer> getScores() { return scores; }
    public void setScores(Set<Integer> scores) { this.scores = scores; }
}
