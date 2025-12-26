// Write a Java program to remove all duplicate characters from a given string.

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String result = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (result.indexOf(ch) == -1) {
                    result = result + ch;
                }
            }

            System.out.println("Modified String: " + result);
        }
    }
}
