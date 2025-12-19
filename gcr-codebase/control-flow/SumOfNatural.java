// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a valid natural number.");
                return;
            }

            int sumFormula = n * (n + 1) / 2;
            int sumWhileLoop = 0;
            int i = 1;

            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhileLoop);

            if (sumFormula == sumWhileLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is an error in one of the computations.");
            }
        }
    }
}