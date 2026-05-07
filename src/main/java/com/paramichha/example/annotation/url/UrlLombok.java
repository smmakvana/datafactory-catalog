package com.paramichha.example.annotation.url;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.URL;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class UrlLombok {
    @NotBlank @URL String website;
    @URL String apiEndpoint;
}
