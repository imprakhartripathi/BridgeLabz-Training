// Create a program to count the number of digits in an integer.
// Hint => 
// Get an integer input for the number variable.
// Create an integer variable count with value 0.
// Use a loop to iterate until number is not equal to 0.
// Remove the last digit from number in each iteration
// Increase count by 1 in each iteration.
// Finally display the count to show the number of digits

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();
            int count = 0;
            int originalNumber = Math.abs(number);

            if (originalNumber == 0) {
                count = 1;
            } else {
                while (originalNumber != 0) {
                    originalNumber /= 10;
                    count++;
                }
            }

            System.out.println("The number of digits in " + number + " is: " + count);
        }
    }
}