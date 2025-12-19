// Write a program to find the sum of numbers until the user enters 0
// Hint => 
// Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
// Use the while loop to check if the user entered is 0
// If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
// The loop will continue till the user enters zero and outside the loop display the total value

// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

import java.util.Scanner;

public class SumTillZeroOrNegative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double total = 0.0;
            double userValue;

            while (true) {
                System.out.print("Enter a number (enter 0 or negative to stop): ");
                userValue = sc.nextDouble();

                if (userValue == 0 || userValue < 0) {
                    break;
                }

                total += userValue;
            }

            System.out.println("The sum is: " + total);
        }
    }
}
