package streamapi;

import java.util.List;

public class NameTransformer {

    public static void main(String[] args) {

        List<String> names = List.of("rahul", "aman", "neha");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
