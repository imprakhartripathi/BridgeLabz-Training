// Create a program to find the BMI of a person
// Hint => 
// Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
// Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Use the table to determine the weight status of the person
// * **BMI ≤ 18.4** → Underweight
// * **BMI 18.5 – 24.9** → Normal
// * **BMI 25.0 – 39.9** → Overweight
// * **BMI ≥ 40.0** → Obese

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            double height = sc.nextDouble();

            double heightInMeters = height / 100;
            double bmi = weight / (heightInMeters * heightInMeters);

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            System.out.println("BMI: " + bmi);
            System.out.println("Weight Status: " + status);
        }
    }
}