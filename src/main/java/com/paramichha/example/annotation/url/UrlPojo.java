package com.paramichha.example.annotation.url;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.URL;

public class UrlPojo {
    @NotBlank @URL String website;
    @URL String apiEndpoint;
    public UrlPojo() {}

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }
    public String getApiEndpoint() { return apiEndpoint; }
    public void setApiEndpoint(String apiEndpoint) { this.apiEndpoint = apiEndpoint; };
}
