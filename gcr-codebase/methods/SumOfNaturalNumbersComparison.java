/*
Write a program to find the sum of n natural numbers using recursive method and compare the result
with the formulae n*(n+1)/2 and show the result from both computations is correct.
Hint =>
Take the user input number and check whether it's a Natural number
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
Compare the two results and print the result
*/

import java.util.Scanner;

public class SumOfNaturalNumbersComparison {

    // Method to calculate sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();
            
            // Checking if number is natural
            if (n <= 0) {
                System.out.println("Please enter a valid natural number.");
                sc.close();
                return;
            }
            
            // Calculations
            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);
            
            // Displaying results
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);
            
            // Comparing results
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct and match.");
            } else {
                System.out.println("Results do not match.");
            }
        }
    }
}
