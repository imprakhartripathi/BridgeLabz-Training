// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
// Hint => 
// Take user input using the  Scanner next() method for 2 String variables
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String Built-In method to check if the results are the same and display the result 

import java.util.Scanner;

public class Compare{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String str1 = sc.next();
            
            System.out.print("Enter second string: ");
            String str2 = sc.next();
            
            boolean charAtRes = compareCharAt(str1, str2);
            boolean equalsRes = str1.equals(str2);
            
            System.out.println("Comparison using .charAt() method: " + charAtRes);
            System.out.println("Comparison using .equals() method: " + equalsRes);
            
            if (charAtRes == equalsRes) {
                System.out.println("Both methods gets the same result.");
            } else {
                System.out.println("The methods gets different results.");
            }   
        }
    }

    public static boolean compareCharAt(String str1, String str2) {
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
}