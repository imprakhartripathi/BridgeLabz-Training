/*
Program:
Find the factors of a given number and perform various operations
using the factors array.
*/

import java.util.Scanner;

public class FactorOperations {

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int number) {

        // loop 1 = count number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // loop 2 = store factors in array
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find greatest factor
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];

        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            int[] factors = findFactors(number);
            
            System.out.println("\nFactors of " + number + ":");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            
            System.out.println("\n\nGreatest Factor: " + findGreatestFactor(factors));
            System.out.println("Sum of Factors: " + findSumOfFactors(factors));
            System.out.println("Product of Factors: " + findProductOfFactors(factors));
            System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));
        }
    }
}
