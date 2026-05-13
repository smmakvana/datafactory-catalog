package com.paramichha.datafactory.catalog.annotation.email;
import jakarta.validation.constraints.*;

public class EmailPojo {
    @NotBlank @Email String email;
    @Email String backupEmail;
    public EmailPojo() {}

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getBackupEmail() { return backupEmail; }
    public void setBackupEmail(String backupEmail) { this.backupEmail = backupEmail; };
}
