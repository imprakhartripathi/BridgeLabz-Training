// Write a program to demonstrate StringIndexOutOfBoundsException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
// Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

import java.util.Scanner;

public class SIOOBEDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Accessing index beyond string length (no try-catch)
        System.out.println(str.charAt(str.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("String length is: " + str.length());
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            // First: method that generates runtime exception
            System.out.println("Generating StringIndexOutOfBoundsException...");
            generateException(input);   // Program stops here due to exception
            
            // This line will not execute unless the above call is commented
            System.out.println("Handling StringIndexOutOfBoundsException...");
            handleException(input);
        }
    }
}
