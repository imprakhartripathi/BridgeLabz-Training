// Write a program to convert the complete text to uppercase and compare the results
// Hint => 
// Take user input using the  Scanner nextLine() method to take the complete text into a String variable
// Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
// Write a method to compare two strings using the charAt() method and return a boolean result
// In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result

import java.util.Scanner;

public class ConvertToUppercaseAndCompare {

    // function to convert a string to uppercase manually
    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32 from ascii value
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // function to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Convert the string to uppercase manually
            String manual = convertToUppercase(input);

            // Use builtin method toUpperCase()
            String builtIn = input.toUpperCase();

            // Compare the two results
            boolean areEqual = compareStrings(manual, builtIn);

            System.out.println("Manual conversion: " + manual);
            System.out.println("Builtin conversion: " + builtIn);
            System.out.println("Are they equal? " + areEqual);
        }
    }
}