package regex;

import java.util.*;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of bad words
        List<String> badWordsList = Arrays.asList(
                "damn",
                "stupid",
                "idiot",
                "fool"
        );

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String regex = "\\b(" + String.join("|", badWordsList) + ")\\b";

        String censoredText = text.replaceAll("(?i)" + regex, "****");

        System.out.println(censoredText);
    }
}
