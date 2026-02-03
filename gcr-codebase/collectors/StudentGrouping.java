package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {

    public static void main(String[] args) {

        Map<String, List<String>> students = new HashMap<>();
        students.put("Grade A", List.of("Aman", "Riya"));
        students.put("Grade B", List.of("Rahul", "Neha"));
        students.put("Grade A", List.of("Aman", "Riya", "Kunal"));

        Map<String, List<String>> grouped =
                students.entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Map.Entry::getKey,
                                Collectors.flatMapping(e -> e.getValue().stream(),
                                        Collectors.toList())
                        ));

        System.out.println(grouped);
    }
}
