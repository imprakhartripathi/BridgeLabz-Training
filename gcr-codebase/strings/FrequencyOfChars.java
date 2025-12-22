// Write a program to find the frequency of characters in a string using the charAt() method and display the result
// Hint => 
// Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Create an array to store the characters and their frequencies
// Loop through the characters in the text and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.  

import java.util.Scanner;

public class FrequencyOfChars {

    static Object[][] findFrequency(String str) {
        int[] frequency = new int[256]; // ASCII frequency array

        // Count frequency using charAt()
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Count unique characters
        int uniqueChars = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueChars++;
            }
        }

        // Store character and frequency
        Object[][] result = new Object[uniqueChars][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i;      // character
                result[index][1] = frequency[i]; // frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            Object[][] frequencies = findFrequency(input);
            
            System.out.println("Character Frequencies:");
            for (Object[] row : frequencies) {
                System.out.println(row[0] + " : " + row[1]);
            }
        }
    }
}
