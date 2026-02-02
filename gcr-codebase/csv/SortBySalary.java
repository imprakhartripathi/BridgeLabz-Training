package csv;

import java.nio.file.*;
import java.util.*;

public class SortBySalary {
    public static void main(String[] args) throws Exception {

        List<String> lines = Files.readAllLines(Path.of("employees.csv"));

        lines.remove(0);

        // sort by salary (descending)
        lines.sort((a, b) -> {
            int salaryB = Integer.parseInt(b.split(",")[4]);
            int salaryA = Integer.parseInt(a.split(",")[4]);
            return Integer.compare(salaryB, salaryA);
        });

        // print top 5 highest paid employees
        lines.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
