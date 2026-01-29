package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
