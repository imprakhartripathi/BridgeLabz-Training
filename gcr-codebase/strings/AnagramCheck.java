// Write a Java program to check if two strings are anagrams of each other.

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String s1 = sc.nextLine().replace(" ", "").toLowerCase();

            System.out.print("Enter second string: ");
            String s2 = sc.nextLine().replace(" ", "").toLowerCase();

            if (s1.length() != s2.length()) {
                System.out.println("Not Anagrams");
                return;
            }

            boolean isAnagram = true;

            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < s1.length(); j++) {
                    if (s1.charAt(j) == ch)
                        count1++;
                    if (s2.charAt(j) == ch)
                        count2++;
                }

                if (count1 != count2) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Strings are Anagrams");
            } else {
                System.out.println("Strings are not Anagrams");
            }
        }
    }
}
