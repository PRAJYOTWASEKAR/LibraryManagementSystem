package com.library.management;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add predefined books
        library.addBook(new Book("101", "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("102", "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("103", "1984", "George Orwell"));
        library.addBook(new Book("104", "Pride and Prejudice", "Jane Austen"));
        library.addBook(new Book("105", "The Catcher in the Rye", "J.D. Salinger"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to Borrow: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Your Name: ");
                    String user = scanner.nextLine();
                    library.borrowBook(id, user);
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    id = scanner.nextLine();
                    library.returnBook(id);
                    break;

                case 5:
                    System.out.print("Enter Book ID to Delete: ");
                    id = scanner.nextLine();
                    library.deleteBook(id);
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
