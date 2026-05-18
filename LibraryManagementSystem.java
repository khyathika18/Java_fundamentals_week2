package Java_week2;



import java.util.ArrayList;
import java.util.List;



public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        // Creating books
        Book b1 = new Book(1, "Java Programming");
        Book b2 = new Book(2, "Data Structures");

        // Adding books
        library.addBook(b1);
        library.addBook(b2);

        // User
        StudentUser user1 = new StudentUser("Khyathika");
        user1.showUser();

        // Borrow book
        library.borrowBook(1);

        // Display books
        library.displayBooks();

        // Return book
        library.returnBook(1);

        // Display books again
        library.displayBooks();
    }
}


abstract class User {
    String userName;

    User(String userName) {
        this.userName = userName;
    }

    abstract void showUser();
}



class Book {
    private int bookId;
    private String title;
    private boolean isIssued;

    
    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    void displayBook() {
        System.out.println(bookId + " - " + title +
                " | Issued: " + isIssued);
    }
}

class StudentUser extends User {

    StudentUser(String userName) {
        super(userName);
    }

    @Override
    void showUser() {
        System.out.println("User: " + userName);
    }
}

class Library {

    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    void borrowBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Book borrowed: " + book.getTitle());
                } else {
                    System.out.println("Book already issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    void returnBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("Book returned: " + book.getTitle());
                } else {
                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    void displayBooks() {
        System.out.println("\nLibrary Books:");

        for (Book book : books) {
            book.displayBook();
        }
    }
}

