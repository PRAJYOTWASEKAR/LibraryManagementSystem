package com.library.management;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;
    private String borrowedBy;
    private LocalDate borrowDate;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.borrowedBy = null;
        this.borrowDate = null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void borrowBook(String user, LocalDate date) {
        this.isBorrowed = true;
        this.borrowedBy = user;
        this.borrowDate = date;
    }

    public void returnBook() {
        this.isBorrowed = false;
        this.borrowedBy = null;
        this.borrowDate = null;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + "\nTitle: " + title + "\nAuthor: " + author +
               "\nStatus: " + (isBorrowed ? "Borrowed by " + borrowedBy + " on " + borrowDate : "Available") + "\n";
    }
}
