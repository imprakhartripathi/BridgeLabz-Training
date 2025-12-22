// Write a program to convert the complete text to lowercase and compare the results
// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result

import java.util.Scanner;

public class ConvertToLowercaseAndCompare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Convert the string to lowercase manually
            String manual = convertToLowercase(input);

            // Use builtin method
            String builtIn = input.toLowerCase();

            // Compare the two res
            boolean areEqual = compareStrings(manual, builtIn);

            System.out.println("Manual conversion:  " + manual);
            System.out.println("Builtin conversion: " + builtIn);
            System.out.println("Are they equal? " + areEqual);
        }
    }

    private static boolean compareStrings(String manual, String builtIn) {
        if (manual.length() != builtIn.length()) {
            return false;
        }

        for (int i = 0; i < manual.length(); i++) {
            if (manual.charAt(i) != builtIn.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static String convertToLowercase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character is uc A-Z, convert to lc a-z
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ascii conversion
            }

            result = result + ch;
        }
        return result;
    }
}
