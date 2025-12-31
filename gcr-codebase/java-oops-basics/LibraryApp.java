public class LibraryApp {

    public static void main(String[] args) {

        Book b = new Book();
        b.borrowBook();
        b.borrowBook();

        b.display();
    }
}

class Book {
    String title;
    String author;
    double price;
    boolean available;

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
            System.out.println("Book borrowed");
        } else {
            System.out.println("Not available");
        }
    }

    void display() {
    System.out.println("Book: " +title + " by " + author + " - $" + price);
}

}
