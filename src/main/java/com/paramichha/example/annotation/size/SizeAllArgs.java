package com.paramichha.example.annotation.size;
import jakarta.validation.constraints.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class SizeAllArgs {    @Size(min=2, max=50) String name;    @Size(min=8, max=100) String password;    @Size(min=1, max=10) List<String> tags;
}
