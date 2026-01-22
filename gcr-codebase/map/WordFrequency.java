package map;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {

        String text = "The Quick Brown Fox Jumps Over The Lazy Dog";

        Map<String, Integer> frequency = new HashMap<>();

        String[] words = text.toLowerCase()
                .replaceAll("[^a-z ]", "")
                .split("\\s+");

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequency);
    }
}
