package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }
}

public class LibraryBookStats {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Fiction", 300),
                new Book("Fiction", 450),
                new Book("Science", 500)
        );

        Map<String, IntSummaryStatistics> stats =
                books.stream()
                        .collect(Collectors.groupingBy(
                                b -> b.genre,
                                Collectors.summarizingInt(b -> b.pages)
                        ));

        stats.forEach((genre, summary) -> {
            System.out.println(genre + " -> " + summary);
        });
    }
}
