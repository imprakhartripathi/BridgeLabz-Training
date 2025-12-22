// Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
// Hint => 
// Take user input using the  Scanner next() method to take the text into a String variable
// Write a method to return the characters in a string without using the toCharArray() 
// Write a method to compare two string arrays and return a boolean result
// In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result

import java.util.Arrays;
import java.util.Scanner;

public class AllStringChars {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.next();

            char[] userDefinedChars = getAllChars(str);
            char[] builtInChars = str.toCharArray();

            boolean compareResult = compareArrays(userDefinedChars, builtInChars);

            System.out.println("User-defined method result: " + Arrays.toString(userDefinedChars));
            System.out.println("Built-in method result: " + Arrays.toString(builtInChars));
            System.out.println("Comparison result: " + compareResult);
        }
    }

    public static char[] getAllChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}