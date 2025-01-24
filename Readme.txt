# Library Management System

## Description
The Library Management System is a Java-based application that helps manage library operations such as adding books, viewing available books, borrowing books, returning books, and deleting books. The system also tracks who borrowed a book, the date of borrowing and returning, and calculates fines if books are returned after 30 days.

## Features
- **Add Books**: Add new books to the library.
- **View Books**: Display all books with their details (title, author, availability status).
- **Borrow Books**: Borrow a book by specifying the book ID and borrower's name.
- **Return Books**: Return a borrowed book and check for fines if the return is delayed beyond 30 days.
- **Delete Books**: Remove a book from the library.
- **Fine Calculation**: Fine of Rs. 5 per day for books returned after 30 days.

## Predefined Books
The system initializes with the following predefined books:
1. "The Great Gatsby" by F. Scott Fitzgerald
2. "To Kill a Mockingbird" by Harper Lee
3. "1984" by George Orwell
4. "Pride and Prejudice" by Jane Austen
5. "The Catcher in the Rye" by J.D. Salinger

## Technologies Used
- **Programming Language**: Java
- **Development Environment**: Eclipse IDE
- **JDK Version**: Java 21

## How to Run the Project
1. **Install Prerequisites**:
   - Download and install [Java JDK 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).
   - Install [Eclipse IDE](https://www.eclipse.org/downloads/).
2. **Clone the Repository**:
   ```bash
   git clone https://github.com/PRAJYOTWASEKAR/LibraryManagementSystem.git
   ```
3. **Import the Project into Eclipse**:
   - Open Eclipse IDE.
   - Click on `File` > `Import` > `Existing Projects into Workspace`.
   - Select the cloned repository folder and click `Finish`.
4. **Run the Application**:
   - Right-click on `LibraryManagementSystem.java` and select `Run As` > `Java Application`.

## Usage Instructions
1. Choose an option from the menu displayed in the console:
   - `1`: Add a new book by providing the ID, title, and author.
   - `2`: View all books and their details.
   - `3`: Borrow a book by providing its ID and your name.
   - `4`: Return a borrowed book. If returned after 30 days, a fine will be calculated.
   - `5`: Delete a book by providing its ID.
   - `6`: Exit the application.

2. Follow the on-screen prompts to perform the desired operations.

## Example
### Borrowing a Book
1. Select option `3` from the menu.
2. Enter the Book ID (e.g., `101`) and your name (e.g., `John Doe`).
3. The system will mark the book as borrowed.

### Returning a Book
1. Select option `4` from the menu.
2. Enter the Book ID (e.g., `101`).
3. If the book is returned after 30 days, a fine will be displayed.

## Directory Structure
```
Library Management System/
|-- src/
|   |-- com/library/management/
|       |-- LibraryManagementSystem.java
|       |-- Library.java
|       |-- Book.java
|-- README.md
```

## Future Enhancements
- GUI for better user experience.
- Search functionality to find books by title or author.
- User authentication and role-based access.

## License
This project is licensed under the MIT License. See `LICENSE` for details.
