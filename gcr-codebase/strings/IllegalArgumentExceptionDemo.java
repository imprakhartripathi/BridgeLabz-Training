// Write a program to demonstrate IllegalArgumentException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // func to generate IllegalArgumentException
    public static void generateException(String str) {
        // start index > end index
        System.out.println(str.substring(5, 2));
    }

    // func to handle IllegalArgumentException
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            // 1st: generate the exception (program stops here)
            System.out.println("Generating IllegalArgumentException...");
            generateException(input);  // comment this line if you want to see the handling
            
            // This will execute only if above line is commented
            System.out.println("Handling IllegalArgumentException...");
            handleException(input);
        }
    }
}
