
public class DemoBook {
    String title;
    String author;
    double price;

    DemoBook() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    DemoBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }

    public static void main(String[] args) {
        DemoBook b1 = new DemoBook();
        DemoBook b2 = new DemoBook("Java", "James Gosling", 499);
        b1.display();
        b2.display();
    }
}
