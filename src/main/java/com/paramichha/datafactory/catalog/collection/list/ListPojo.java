package com.paramichha.datafactory.catalog.collection.list;
import jakarta.validation.constraints.*;
import java.util.*;

public class ListPojo {
    @NotEmpty List<String> roles;
    @Size(min=1, max=5) List<String> tags;
     List<Integer> scores;
     Collection<String> labels;
    public ListPojo() {}

    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }
    public List<Integer> getScores() { return scores; }
    public void setScores(List<Integer> scores) { this.scores = scores; }
    public Collection<String> getLabels() { return labels; }
    public void setLabels(Collection<String> labels) { this.labels = labels; };
}
