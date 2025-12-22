// Write a program to split the text into words and find the shortest and longest strings in a given text
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
// The main function calls the user-defined methods and displays the result. 


import java.util.Scanner;

public class ShortestAndLongestStrinngs {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the text:");
            String input = sc.nextLine();
            
            String[] words = splitTextIntoWords(input);
            String[][] wordLengthArray = mapWordsWithLength(words);
            int[] result = findShortestAndLongest(wordLengthArray);
            
            System.out.println("Shortest word length: " + result[0]);
            System.out.println("Longest word length: " + result[1]);
        }
    }

    // Method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {

        int count = 1;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count];
        int index = 0;
        String temp = "";

        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                words[index++] = temp;
                temp = "";
            }
        }

        words[index] = temp;
        return words;
    }

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return length;
    }

    // Method to create 2D array of word and its length
    public static String[][] mapWordsWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = getStringLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Method to find shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] data) {

        int shortest = Integer.parseInt(data[0][1]);
        int longest = shortest;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < shortest) {
                shortest = len;
            }

            if (len > longest) {
                longest = len;
            }
        }

        return new int[]{shortest, longest};
    }
}
