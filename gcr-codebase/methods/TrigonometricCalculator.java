/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint =>
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function
to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/

import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();
            
            // Calculating trigonometric functions
            double[] result = calculateTrigonometricFunctions(angle);
            
            // Displaying result
            System.out.println("Sine of angle: " + result[0]);
            System.out.println("Cosine of angle: " + result[1]);
            System.out.println("Tangent of angle: " + result[2]);
        }
    }
}
