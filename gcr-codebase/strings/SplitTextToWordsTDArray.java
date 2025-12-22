// Write a program to split the text into words and return the words along with their lengths in a 2D array
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display

import java.util.Scanner;

public class SplitTextToWordsTDArray {

    // Method to calculate string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // termination point
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitIntoWords(String text) {
        int length = getStringLength(text);
        int wordCount = 0;
        boolean inWord = false;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String currentWord = "";

        // Extract words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                currentWord += text.charAt(i);
            } else if (!currentWord.equals("")) {
                words[index++] = currentWord;
                currentWord = "";
            }
        }

        if (!currentWord.equals("")) {
            words[index] = currentWord;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] buildWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitIntoWords(input);
        String[][] table = buildWordLengthTable(words);

        for (String[] row : table) {
            int length = Integer.parseInt(row[1]);
            System.out.println("word: " + row[0] + ", length: " + length);
        }
    }
}

}

