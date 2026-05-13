package com.paramichha.datafactory.catalog.annotation.url;
import jakarta.validation.constraints.*;

public record UrlRecord(@NotBlank @org.hibernate.validator.constraints.URL String website, @org.hibernate.validator.constraints.URL String apiEndpoint) {}
