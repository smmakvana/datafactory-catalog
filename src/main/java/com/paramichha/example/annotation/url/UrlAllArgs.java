package com.paramichha.example.annotation.url;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.URL;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class UrlAllArgs {    @NotBlank @URL String website;    @URL String apiEndpoint;
}
