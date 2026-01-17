package bookshelf.impl;

import java.util.*;

public class Library {
    private final Map<String, LinkedList<Book>> genreMap = new HashMap<>();
    private final Set<Book> bookSet = new HashSet<>(); // avoids duplicates

    public void addBook(String genre, Book book) {
        if (!bookSet.add(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        genreMap
                .computeIfAbsent(genre, g -> new LinkedList<>())
                .add(book);

        System.out.println("Added: " + book + " to " + genre);
    }

    public void removeBook(String genre, Book book) {
        LinkedList<Book> books = genreMap.get(genre);

        if (books != null && books.remove(book)) {
            bookSet.remove(book);
            System.out.println("Removed: " + book);
        } else {
            System.out.println("Book not found");
        }
    }

    public void displayGenre(String genre) {
        LinkedList<Book> books = genreMap.get(genre);
        System.out.println("Genre: " + genre);

        if (books == null || books.isEmpty()) {
            System.out.println("No books available");
            return;
        }

        books.forEach(System.out::println);
    }
}
