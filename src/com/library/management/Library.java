package com.library.management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String id, String user) {
        for (Book book : books) {
            if (book.getId().equals(id) && !book.isBorrowed()) {
                book.borrowBook(user, LocalDate.now());
                System.out.println("Book borrowed successfully!");
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    public void returnBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id) && book.isBorrowed()) {
                long daysBorrowed = ChronoUnit.DAYS.between(book.getBorrowDate(), LocalDate.now());
                book.returnBook();

                if (daysBorrowed > 30) {
                    long fine = (daysBorrowed - 30) * 5; // Assuming fine is Rs. 5 per extra day
                    System.out.println("Book returned successfully! Fine incurred: Rs. " + fine);
                } else {
                    System.out.println("Book returned successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found or not borrowed.");
    }

    public void deleteBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
