/*
Program:
Take user input for 5 numbers and:
1. Check whether each number is positive or negative
2. For positive numbers, check whether the number is even or odd
3. Compare the first and last elements of the array
*/

import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] numbers = new int[5];
            
            // Taking input
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }
            
            // Checking positive/negative and even/odd
            for (int i = 0; i < numbers.length; i++) {
                
                if (isPositive(numbers[i])) {
                    System.out.print(numbers[i] + " is Positive and ");
                    
                    if (isEven(numbers[i])) {
                        System.out.println("Even.");
                    } else {
                        System.out.println("Odd.");
                    }
                    
                } else {
                    System.out.println(numbers[i] + " is Negative.");
                }
            }
            
            // Comparing first and last elements
            int result = compare(numbers[0], numbers[numbers.length - 1]);
            
            System.out.println("\nComparison of first and last elements:");
            switch (result) {
                case 1 -> System.out.println("First element is Greater than Last element.");
                case 0 -> System.out.println("First element is Equal to Last element.");
                default -> System.out.println("First element is Less than Last element.");
            }
        }
    }
}
