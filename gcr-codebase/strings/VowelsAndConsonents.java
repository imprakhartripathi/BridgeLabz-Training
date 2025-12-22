
import java.util.Scanner;

// Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
// Hint => 
// Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
// Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

public class VowelsAndConsonents {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the text:");
            String input = sc.nextLine();
            int[] result = countVowelsAndConsonants(input);
            System.out.println("Vowels: " + result[0]);
            System.out.println("Consonants: " + result[1]);
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

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        
        return new int[]{vowels, consonants};
    }
}