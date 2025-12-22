// Find unique characters in a string using the charAt() method and display the result
// Hint => 
// Create a Method to find the length of the text without using the String method length()
// Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
// Create an array to store the unique characters in the text. The size is the length of the text
// Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
// Create a new array to store the unique characters 
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

import java.util.Scanner;

public class UniqueChars {

    // Method to find the length of a string without using the String method length()
    static int findLength(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    // Method to find unique characters in a string
    static char[] findUniqueChars(String str) {
        int len = findLength(str);
        char[] uniqueChars = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < index; j++) {
                if (uniqueChars[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[index++] = ch;
            }
        }

        // Create a new array with only the unique characters
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = sc.nextLine();
            
            char[] uniqueCharsArray = findUniqueChars(inputString);
            
            System.out.println("Unique characters in the string:");
            for (char c : uniqueCharsArray) {
                System.out.print(c + " ");
            }
        }
    }
}