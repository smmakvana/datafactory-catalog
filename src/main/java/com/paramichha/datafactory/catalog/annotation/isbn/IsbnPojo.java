package com.paramichha.datafactory.catalog.annotation.isbn;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.ISBN;

public class IsbnPojo {
    @NotBlank @ISBN String isbn;
    @NotBlank String title;
    public IsbnPojo() {}

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; };
}
