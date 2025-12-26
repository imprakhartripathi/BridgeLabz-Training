// Write a Java program that returns the longest word in a sentence.

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            String[] words = sentence.split(" ");
            String longest = words[0];

            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > longest.length()) {
                    longest = words[i];
                }
            }

            System.out.println("Longest Word: " + longest);
        }
    }
}
