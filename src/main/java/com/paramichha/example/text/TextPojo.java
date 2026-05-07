package com.paramichha.example.text;
import jakarta.validation.constraints.*;

public class TextPojo {
    @NotBlank @Size(min=1, max=100) String name;
    @NotBlank @Size(min=2, max=500) String description;
     String notes;
     char initial;
    public TextPojo() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    public char getInitial() { return initial; }
    public void setInitial(char initial) { this.initial = initial; };
}
