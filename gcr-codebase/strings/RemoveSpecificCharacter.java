// Write a Java program to remove all occurrences of a specific character from a string.

import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            System.out.print("Enter character to remove: ");
            char remove = sc.next().charAt(0);

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != remove) {
                    result = result + str.charAt(i);
                }
            }

            System.out.println("Modified String: " + result);
        }
    }
}
