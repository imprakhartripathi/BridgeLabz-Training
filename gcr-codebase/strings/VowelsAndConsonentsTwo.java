// Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
// Hint => 
    // Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
// Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
// Create a Method to display the 2D Array of Strings in a Tabular Format
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


import java.util.Scanner;

public class VowelsAndConsonentsTwo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the text: ");
            
            String input = sc.nextLine();
            String[][] result = findVowelsAndConsonants(input);
            displayResult(result);
        }
    }

    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = checkCharacter(ch);
        }
        
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println();
        System.out.println("Character\tType");
        System.err.println("---------------------------");
        for (String[] data1 : data) {
            System.out.println(data1[0] + "\t\t" + data1[1]);
        }
    }
}