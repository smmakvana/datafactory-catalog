package com.paramichha.example.annotation.size;
import jakarta.validation.constraints.*;
import java.util.List;

public record SizeRecord(@Size(min=2, max=50) String name, @Size(min=8, max=100) String password, @Size(min=1, max=10) java.util.List<String> tags) {}
