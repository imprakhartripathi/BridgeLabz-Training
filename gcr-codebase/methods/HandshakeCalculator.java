/*
Create a program to find the maximum number of handshakes among students.
Hint =>
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
*/

import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        // Taking input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking input
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();
            // Calculating handshakes
            int handshakes = calculateHandshakes(numberOfStudents);
            
            // Displaying result
            System.out.println("The maximum number of possible handshakes is " + handshakes);
        }
    }
}
