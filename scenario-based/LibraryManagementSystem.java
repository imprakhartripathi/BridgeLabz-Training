import java.util.Scanner;

public class LibraryManagementSystem {

    static String[] titles = {
            "Clean Code",
            "Effective Java",
            "Design Patterns",
            "Java Programming"
    };

    static String[] authors = {
            "Robert Martin",
            "Joshua Bloch",
            "GoF",
            "Herbert Schildt"
    };

    static boolean[] isAvailable = { true, true, true, true };

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            displayBooks();
            
            System.out.print("\nEnter partial title to search: ");
            String searchKey = sc.nextLine();
            
            int index = searchBook(searchKey);
            
            if (index != -1) {
                System.out.println("Book Found:");
                printBook(index);
                
                System.out.print("Do you want to check out this book? (yes/no): ");
                String choice = sc.nextLine();
                
                if (choice.equalsIgnoreCase("yes")) {
                    checkoutBook(index);
                }
            } else {
                System.out.println("No matching book found.");
            }
        }
    }

    static void displayBooks() {
        System.out.println("Library Inventory:");
        for (int i = 0; i < titles.length; i++) {
            printBook(i);
        }
    }

    static int searchBook(String key) {
        key = key.toLowerCase();
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(key)) {
                return i;
            }
        }
        return -1;
    }

    static void checkoutBook(int index) {
        if (isAvailable[index]) {
            isAvailable[index] = false;
            System.out.println("Book successfully checked out.");
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    static void printBook(int i) {
        System.out.println(
                (i + 1) + ". " + titles[i] +
                " | Author: " + authors[i] +
                " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
        );
    }
}
