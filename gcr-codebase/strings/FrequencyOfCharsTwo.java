// Write a program to find the frequency of characters in a string using unique characters and display the result
// Hint => 
// Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
// Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
// Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
// Loop through the text to find the frequency of characters in the text
// Call the uniqueCharacters() method to find the unique characters in the text
// Create a 2D String array to store the unique characters and their frequencies. 
// Loop through the unique characters and store the characters and their frequencies
// In the main function take user inputs, call user-defined methods, and displays result.  


import java.util.Scanner;

public class FrequencyOfCharsTwo {

    // Method to find unique characters using nested loops
    static char[] uniqueCharacters(String str) {

        char[] temp = new char[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count++] = current;
            }
        }

        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find frequency using ASCII logic and unique characters
    static String[][] findFrequency(String str) {

        int[] frequency = new int[256]; // ASCII frequency array

        // Count frequency using charAt()
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            String[][] frequencies = findFrequency(input);
            
            System.out.println("Character Frequencies:");
            for (String[] row : frequencies) {
                System.out.println(row[0] + " : " + row[1]);
            }
        }
    }
}

