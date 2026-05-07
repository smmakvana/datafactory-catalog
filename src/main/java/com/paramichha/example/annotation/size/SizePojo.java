package com.paramichha.example.annotation.size;
import jakarta.validation.constraints.*;
import java.util.List;

public class SizePojo {
    @Size(min=2, max=50) String name;
    @Size(min=8, max=100) String password;
    @Size(min=1, max=10) List<String> tags;
    public SizePojo() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; };
}
