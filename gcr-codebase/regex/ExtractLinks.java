package regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        Matcher m = Pattern.compile("https?://\\S+").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
