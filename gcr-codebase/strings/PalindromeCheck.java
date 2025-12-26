// Write a Java program to check if a given string is a palindrome.

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int start = 0;
            int end = str.length() - 1;
            boolean palindrome = true;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    palindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if (palindrome) {
                System.out.println("Palindrome String");
            } else {
                System.out.println("Not a Palindrome String");
            }
        }
    }
}
