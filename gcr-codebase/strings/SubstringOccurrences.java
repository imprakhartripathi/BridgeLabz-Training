// Write a Java program to count how many times a given substring occurs in a string.

import java.util.Scanner;

public class SubstringOccurrences {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter main string: ");
            String str = sc.nextLine();

            System.out.print("Enter substring: ");
            String sub = sc.nextLine();

            int count = 0;

            for (int i = 0; i <= str.length() - sub.length(); i++) {
                if (str.substring(i, i + sub.length()).equals(sub)) {
                    count++;
                }
            }

            System.out.println("Occurrences: " + count);
        }
    }
}
