package regex;

import java.util.Scanner;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        Matcher m = Pattern
                .compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE)
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}

// only matches back to back repeating words