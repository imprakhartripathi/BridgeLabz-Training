// Write a program to find and return the length of a string without using the length() method 
// Hint => 
// Take user input using the Scanner next() method 
// Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
// The main function calls the user-defined method as well as the built-in length() method and displays the result

import java.util.Scanner;

public class LengthOfString {

    // Method to find the length of a string without using the builtin method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index is out of bounds, so return the count
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            int manualLength = findLength(input);
            int builtInLength = input.length();
            
            System.out.println("Manual length: " + manualLength);
            System.out.println("Builtin length: " + builtInLength);
        }
    }
}