// Rewrite program 14 using for loop
// Hint => 
// Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 

import java.util.Scanner;

public class FactorialWithFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }
}