// Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
// Hint => 
// Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
// Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
// Write a method to compare two strings using the charAt() method and return a boolean result
// Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.next();
            
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            
            System.out.print("Enter end index: ");
            int end = sc.nextInt();
            
            String charAtSubString = createSubstringUsingCharAt(str, start, end);
            String builtInSubString = str.substring(start, end);
            
            boolean compareResult = compareStrings(charAtSubString, builtInSubString);
            
            System.out.println("Substring using .charAt() method: " + charAtSubString);
            System.out.println("Substring using .substring() method: " + builtInSubString);
            System.out.println("Comparison result: " + compareResult);
        }
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

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
}