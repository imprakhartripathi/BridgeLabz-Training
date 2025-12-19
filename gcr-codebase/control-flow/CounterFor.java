// Write a program to count down the number from the user input value to 1 using a for loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the for loop to check if the counter is 1
// Inside a for loop, print the value of the counter and decrement the counter.

import java.util.Scanner;

public class CounterFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the starting number for countdown: ");
            int counter = sc.nextInt();

            for (int i = counter; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
