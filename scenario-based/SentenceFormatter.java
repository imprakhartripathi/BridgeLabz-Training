import java.util.Scanner;

public class SentenceFormatter {

    public static String format(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Trim and normalize spaces
        input = input.trim().replaceAll("\\s+", " ");

        // Ensure one space after punctuation
        input = input.replaceAll("\\s*([.!?])\\s*", "$1 ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : input.toCharArray()) {
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '!' || ch == '?') {
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Enter paragraph:");
            String paragraph = inp.nextLine();
            
            String formatted = format(paragraph);
            System.out.println("\nFormatted Output:");
            System.out.println(formatted);
        }
    }
}
