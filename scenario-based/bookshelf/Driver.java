package bookshelf;

import bookshelf.impl.Book;
import bookshelf.impl.Library;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Library library = new Library();
            boolean running = true;
            System.out.println("\n=== BookShelf Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Genre");
            System.out.println("4. Exit");

            while (running) {

                System.out.print("\nChoose option: ");
                
                int choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    
                    case 1 -> {
                        System.out.print("Enter genre: ");
                        String genre = sc.nextLine();
                        
                        System.out.print("Enter book title: ");
                        String title = sc.nextLine();
                        
                        System.out.print("Enter author name: ");
                        String author = sc.nextLine();
                        
                        library.addBook(genre, new Book(title, author));
                    }
                        
                    case 2 -> {
                        System.out.print("Enter genre: ");
                        String genre = sc.nextLine();
                        System.out.print("Enter book title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter author name: ");
                        String author = sc.nextLine();
                        library.removeBook(genre, new Book(title, author));
                    }
                        
                    case 3 -> {
                        System.out.print("Enter genre: ");
                        String genre = sc.nextLine();
                        library.displayGenre(genre);
                    }
                        
                    case 4 -> {
                        running = false;
                        System.out.println("Exiting BookShelf...");
                    }
                        
                    default -> System.out.println("Invalid option");
                }
            }
        }
    }
}
