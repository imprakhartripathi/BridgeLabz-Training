import java.util.*;

public class LibraryManagementSystemTwo {

    static class BookNotAvailableException extends Exception {
        public BookNotAvailableException(String msg) {
            super(msg);
        }
    }

    static class Book {
        String title;
        String author;
        boolean available;

        Book(String title, String author, boolean available) {
            this.title = title;
            this.author = author;
            this.available = available;
        }
    }

    static List<Book> library = new ArrayList<>();

    public static void searchByTitle(String keyword) {
        boolean found = false;

        System.out.println("\nSearch Results:");
        System.out.println("---------------------------------");

        for (Book b : library) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " | " + b.author +
                        " | " + (b.available ? "Available" : "Checked Out"));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found matching the title.");
        }

        System.out.println("---------------------------------");
    }

    public static void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : library) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) {
                    throw new BookNotAvailableException("Book is already checked out.");
                }
                b.available = false;
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    public static void displayAllBooks() {
        System.out.println("\nLibrary Inventory:");
        System.out.println("---------------------------------");

        if (library.isEmpty()) {
            System.out.println("No books available.");
        }

        for (Book b : library) {
            System.out.println(b.title + " | " + b.author +
                    " | " + (b.available ? "Available" : "Checked Out"));
        }

        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Preloaded books
            library.add(new Book("Java Programming", "James Gosling", true));
            library.add(new Book("Data Structures", "Mark Allen", false));
            
            int choice;
            
            System.out.println("=================================");
            System.out.println("      LIBRARY MANAGEMENT SYSTEM");
            System.out.println("=================================");
            
            do {
                System.out.println("\n1. Search Book by Title");
                System.out.println("2. Checkout Book");
                System.out.println("3. Display All Books");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                
                choice = Integer.parseInt(sc.nextLine());
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter title keyword: ");
                        searchByTitle(sc.nextLine());
                    }
                        
                    case 2 -> {
                        System.out.print("Enter full book title to checkout: ");
                        try {
                            checkoutBook(sc.nextLine());
                        } catch (BookNotAvailableException e) {
                            System.out.println("ERROR: " + e.getMessage());
                        }
                    }
                        
                    case 3 -> displayAllBooks();
                        
                    case 4 -> System.out.println("Exiting Library System.");
                        
                    default -> System.out.println("Invalid choice. Try again.");
                }
                
            } while (choice != 4);
        }
    }
}
