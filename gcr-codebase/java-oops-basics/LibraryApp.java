public class LibraryApp {

    public static void main(String[] args) {

        Book b = new Book("Clean Code", "Robert C. Martin", 499.99);

        b.borrowBook(); 
        b.borrowBook(); 

        b.display();
    }
}

class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Status: " + (available ? "Available" : "Borrowed"));
    }
}
