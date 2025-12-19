// Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            long factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }
}