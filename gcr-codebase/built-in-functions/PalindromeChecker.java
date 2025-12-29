// 5. Palindrome Checker:
// ○ Write a program that checks if a given string is a palindrome (a word, phrase,
// or sequence that reads the same backward as forward).
// ○ Break the program into functions for input, checking the palindrome condition,
// and displaying the result.

import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string");

            String input = sc.nextLine();

            if (isPalindrome(input)) {
                System.out.println("String is palindrome");
            } else {
                System.out.println("String is not palindrome");
            }
        }
    }
}
