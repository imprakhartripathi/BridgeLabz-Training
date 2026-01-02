public class BookDemoTwo {

    private static final String LIB_NAME = "Egmore Library";

    public static String getLIB_NAME() {
        return LIB_NAME;
    }

    private final String isbn;
    private final String title;
    private final String author;

    public BookDemoTwo(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLIB_NAME() {
        System.out.println("Library Name: " + LIB_NAME);
    }

    public void displayBookDemoTwo() {
        if (this instanceof BookDemoTwo) {
            displayLIB_NAME();
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        BookDemoTwo BookDemoTwo = new BookDemoTwo("Effective Java", "Joshua Bloch", "978-0134685991");
        BookDemoTwo.displayBookDemoTwo();
    }
}
