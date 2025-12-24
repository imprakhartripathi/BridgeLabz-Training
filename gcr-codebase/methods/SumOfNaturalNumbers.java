/*
Write a program to find the sum of n natural numbers using loop
Hint =>
Get integer input from the user.
Write a Method to find the sum of n natural numbers using loop
*/

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum of n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();
            
            // Calculating sum
            int result = calculateSum(n);
            
            // Displaying result
            System.out.println("The sum of first " + n + " natural numbers is " + result);
        }
    }
}
