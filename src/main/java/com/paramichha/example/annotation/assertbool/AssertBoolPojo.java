package com.paramichha.example.annotation.assertbool;
import jakarta.validation.constraints.*;

public class AssertBoolPojo {
    @AssertTrue boolean active;
    @AssertFalse boolean deleted;
    public AssertBoolPojo() {}

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
    public boolean isDeleted() { return deleted; }
    public void setDeleted(boolean deleted) { this.deleted = deleted; };
}
