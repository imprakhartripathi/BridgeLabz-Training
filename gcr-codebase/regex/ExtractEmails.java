package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        Matcher m = Pattern
                .compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
                .matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
