package com.paramichha.example.collection.array;
import jakarta.validation.constraints.*;
import java.util.*;

public class ArrayPojo {
    @NotNull String[] names;
    @NotNull int[] scores;
    String[] tags;
    public ArrayPojo() {}
    public String[] getNames() { return names; }
    public void setNames(String[] names) { this.names = names; }
    public int[] getScores() { return scores; }
    public void setScores(int[] scores) { this.scores = scores; }
    public String[] getTags() { return tags; }
    public void setTags(String[] tags) { this.tags = tags; }
}
