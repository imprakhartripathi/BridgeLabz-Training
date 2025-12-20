// Maya’s BMI Fitness Tracker 🏃‍♀️
// Maya, a fitness coach, wants to record the BMI of her clients.
// ● Ask for height and weight.
// ● Use formula BMI = weight / (height * height)
// ● Print category using if-else: Underweight, Normal, Overweight.
// Use clear variable names and comments to maintain code hygiene.

import java.util.Scanner;

public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();
            double bmi = weight / (height * height);
            System.out.println("Your BMI is: " + bmi);
            if (bmi < 18.5) {
                System.out.println("Category: Underweight");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                System.out.println("Category: Normal");
            } else {
                System.out.println("Category: Overweight");
            }
        }
    }
}