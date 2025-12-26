// Write a replace method in Java that replaces a given word with another word in a sentence.

import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            System.out.print("Enter word to replace: ");
            String oldWord = sc.nextLine();

            System.out.print("Enter new word: ");
            String newWord = sc.nextLine();

            String result = sentence.replace(oldWord, newWord);

            System.out.println("Modified Sentence: " + result);
        }
    }
}
