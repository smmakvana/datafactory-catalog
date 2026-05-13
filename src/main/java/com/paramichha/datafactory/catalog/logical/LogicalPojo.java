package com.paramichha.datafactory.catalog.logical;
import jakarta.validation.constraints.*;

public class LogicalPojo {
    @AssertTrue boolean active;
    @AssertTrue Boolean verified;
    @AssertFalse boolean deleted;
    @AssertFalse Boolean archived;
    public LogicalPojo() {}

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
    public Boolean getVerified() { return verified; }
    public void setVerified(Boolean verified) { this.verified = verified; }
    public boolean isDeleted() { return deleted; }
    public void setDeleted(boolean deleted) { this.deleted = deleted; }
    public Boolean getArchived() { return archived; }
    public void setArchived(Boolean archived) { this.archived = archived; };
}
