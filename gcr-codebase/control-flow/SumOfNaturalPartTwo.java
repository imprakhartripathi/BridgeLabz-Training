// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result

import java.util.Scanner;

public class SumOfNaturalPartTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a valid natural number.");
                return;
            }

            int sumFormula = n * (n + 1) / 2;
            int sumForLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumForLoop);

            if (sumFormula == sumForLoop) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is an error in one of the computations.");
            }
        }
    }
}