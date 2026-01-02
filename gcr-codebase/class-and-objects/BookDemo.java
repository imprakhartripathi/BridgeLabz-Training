public class BookDemo {
    String title;
    String author;
    double price;

    void display() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
    }

    public static void main(String[] args) {
        BookDemo b1 = new BookDemo();
        b1.title = "2States";
        b1.author = "Chetan Bhagat";
        b1.price = 500;

        BookDemo b2 = new BookDemo();
        b2.title = "Wings Of Fire";
        b2.author = "Abdul kalam.A.P.J";
        b2.price = 500;

        b1.display();
        b2.display();
    }
}
