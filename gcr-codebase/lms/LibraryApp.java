package lms;

import java.util.Scanner;

import lms.impl.Book;
import lms.impl.LibraryCatalog;
import lms.impl.User;
import lms.impl.UserFactory;
import lms.impl.UserFactory.UserType;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        System.out.print("Enter number of users to register: ");
        int userCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= userCount; i++) {
            System.out.println("\nEnter details for user " + i);

            System.out.print("Enter user type (STUDENT / FACULTY / LIBRARIAN): ");
            String typeInput = sc.nextLine();

            System.out.print("Enter user name: ");
            String name = sc.nextLine();

            try {
                UserType type = UserType.valueOf(typeInput.toUpperCase());
                User user = UserFactory.createUser(type, name);

                user.showRole();
                catalog.addObserver(user);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid user type. User skipped.");
            }
        }

        System.out.println("\n--- Enter Book Details ---");

        System.out.print("Title (mandatory): ");
        String title = sc.nextLine();

        Book.BookBuilder builder = new Book.BookBuilder(title);

        System.out.print("Author (optional, press Enter to skip): ");
        String author = sc.nextLine();
        if (!author.isEmpty()) {
            builder.author(author);
        }

        System.out.print("Edition (optional, press Enter to skip): ");
        String edition = sc.nextLine();
        if (!edition.isEmpty()) {
            builder.edition(edition);
        }

        System.out.print("Genre (optional, press Enter to skip): ");
        String genre = sc.nextLine();
        if (!genre.isEmpty()) {
            builder.genre(genre);
        }

        Book book = builder.build();

        catalog.addBook(book);

        sc.close();
    }
}
