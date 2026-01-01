import java.util.Scanner;
import java.util.regex.Pattern;

public class TextAnalyzer {

    public static void analyze(String paragraph, String target, String replacement) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty or invalid.");
            return;
        }

        String[] words = paragraph.trim().split("\\s+");

        // Word count
        int wordCount = words.length;

        // Longest word
        String longestWord = "";
        for (String word : words) {
            String clean = word.replaceAll("[^a-zA-Z]", "");
            if (clean.length() > longestWord.length()) {
                longestWord = clean;
            }
        }

        // Case-insensitive replacement
        String updatedParagraph = paragraph.replaceAll(
                "(?i)\\b" + Pattern.quote(target) + "\\b",
                replacement
        );

        // Output
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Updated Paragraph:");
        System.out.println(updatedParagraph);
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Enter paragraph:");
            String paragraph = inp.nextLine();
            
            System.out.println("Enter word to replace:");
            String target = inp.next();
            
            System.out.println("Enter replacement word:");
            String replacement = inp.next();
            
            System.out.println();
            analyze(paragraph, target, replacement);
        }
    }
}
