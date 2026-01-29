package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
