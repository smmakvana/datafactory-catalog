package com.paramichha.datafactory.catalog.annotation.size;
import jakarta.validation.constraints.*;

public record SizeRecord(@Size(min=2, max=50) String name, @Size(min=8, max=100) String password, @Size(min=1, max=10) java.util.List<String> tags) {}
