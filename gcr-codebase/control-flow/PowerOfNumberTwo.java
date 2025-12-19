// Rewrite the above program to find the power of a number using a while loop.
// Hint => 
// Get integer input for two variables named number and power.
// Create a result variable with an initial value of 1.
// Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
// In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
// Finally, print the result

import java.util.Scanner;

public class PowerOfNumberTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base number: ");
            int number = sc.nextInt();

            System.out.print("Enter the power: ");
            int power = sc.nextInt();

            if (number <= 0 || power < 0) {
                System.out.println("Please enter a positive base and a non-negative power.");
                return;
            }

            int result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
    }
}