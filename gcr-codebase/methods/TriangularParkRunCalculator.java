/*
An athlete runs in a triangular park with sides provided as input by the user in meters.
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint =>
Take user input for 3 sides of a triangle
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/

import java.util.Scanner;

public class TriangularParkRunCalculator {

    // Method to calculate number of rounds to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter side 1 of the triangle (in meters): ");
            double side1 = sc.nextDouble();
            
            System.out.print("Enter side 2 of the triangle (in meters): ");
            double side2 = sc.nextDouble();
            
            System.out.print("Enter side 3 of the triangle (in meters): ");
            double side3 = sc.nextDouble();
            
            // Calculating number of rounds
            double rounds = calculateRounds(side1, side2, side3);
            
            // Displaying result
            System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run.");
        }
    }
}
