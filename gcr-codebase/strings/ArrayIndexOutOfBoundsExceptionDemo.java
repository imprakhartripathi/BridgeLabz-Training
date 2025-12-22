// Write a program to demonstrate ArrayIndexOutOfBoundsException
// Hint => 
// Define a variable of array of names and take input from the user
// Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeExceptio


public class ArrayIndexOutOfBoundsExceptionDemo {

    // func to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing +1 index of array length
        System.out.println(names[names.length]);
    }

    // func to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        String[] names = {"Amar", "Akbar", "Anthony"};

        // generate the exception
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        generateException(names); // comment this line to see the handling

        // This will execute only if above line is commented
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        handleException(names);
    }
}