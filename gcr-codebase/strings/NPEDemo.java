// Write a program to demonstrate NullPointerException. 
// Hint => 
// Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
// Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
// From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException

public class NPEDemo {
    public static void main(String[] args) {

        generateNPE();
        generateHandledNPE();
    }

    @SuppressWarnings("null")
    public static void generateNPE() {
        String text = null;
        System.out.println("Length: " + text.length());
    }

    @SuppressWarnings("null")
    public static void generateHandledNPE() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: " + e.getMessage());
        }
    }
}
