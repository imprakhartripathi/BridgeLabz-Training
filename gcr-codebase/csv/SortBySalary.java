package csv;

import java.nio.file.*;
import java.util.*;

public class SortBySalary {
    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Path.of("employees.csv"));
        lines.remove(0);
        lines.sort((a, b) ->
                Integer.parseInt(b.split(",")[3]) - Integer.parseInt(a.split(",")[3])
        );
        lines.stream().limit(5).forEach(System.out::println);
    }
}
