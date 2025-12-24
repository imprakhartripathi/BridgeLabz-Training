/*
Write a program to take 2 numbers and print their quotient and reminder
Hint =>
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number
public static int[] findRemainderAndQuotient(int number, int divisor)
*/

import java.util.Scanner;

public class RemainderAndQuotientCalculator {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            
            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();
            
            // Calculating remainder and quotient
            int[] result = findRemainderAndQuotient(number, divisor);
            
            // Displaying result
            System.out.println("Quotient is: " + result[1]);
            System.out.println("Remainder is: " + result[0]);
        }
    }
}
