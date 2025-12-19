// Write a program to check whether a number is positive, negative, or zero.
// Hint => 
// Get integer input from the user and store it in the number variable.
// If the number is positive, print positive.
// If the number is negative, print negative.
// If the number is zero, print zero. 

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number > 0) {
                System.out.println("positive");
            } else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
    }
}