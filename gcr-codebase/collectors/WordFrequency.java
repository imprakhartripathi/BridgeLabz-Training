package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main(String[] args) {

        String text = "java streams java collectors streams java";

        Map<String, Long> frequency =
                Arrays.stream(text.split("\\s+"))
                        .collect(Collectors.toMap(
                                word -> word,
                                word -> 1L,
                                Long::sum
                        ));

        System.out.println(frequency);
    }
}
