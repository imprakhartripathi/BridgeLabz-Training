/*
Write a program to check whether a number is positive, negative, or zero.
Hint =>
Get integer input from the user.
Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.Scanner;

public class NumberSignChecker {

    // Method to check number sign
    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            // Checking number sign
            int result = checkNumberSign(number);
            
            // Displaying result
            switch (result) {
                case 1 -> System.out.println("The number is positive.");
                case -1 -> System.out.println("The number is negative.");
                default -> System.out.println("The number is zero.");
            }
        }
    }
}
