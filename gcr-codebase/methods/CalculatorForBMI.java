/*
Program:
Calculate the Body Mass Index (BMI) for 10 team members and display
their Height, Weight, BMI, and BMI Status.

BMI Formula:
BMI = weight / (height * height)
(Note: height must be converted from cm to meters)

BMI Status:
<= 18.4        -> Underweight
18.5 – 24.9    -> Normal
25.0 – 39.9    -> Overweight
>= 40.0        -> Obese
*/

import java.util.Scanner;

public class CalculatorForBMI {

    // Method to calculate BMI and populate the 3rd column of array
    public static void calculateBMI(double[][] data) {
        for (double[] data1 : data) {
            double weight = data1[0];
            double heightCm = data1[1];
            double heightMeter = heightCm / 100;
            data1[2] = weight / (heightMeter * heightMeter);
        }
    }

    // Method to determine BMI status for all persons
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 10 rows, 3 columns -> Weight, Height, BMI
            double[][] persons = new double[10][3];
            
            // Taking input
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                persons[i][0] = sc.nextDouble();
                
                System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
                persons[i][1] = sc.nextDouble();
            }
            
            // Calculate BMI
            calculateBMI(persons);
            
            // Get BMI status
            String[] bmiStatus = getBMIStatus(persons);
            
            // Display result
            System.out.println("\n--- BMI REPORT ---");
            System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
            
            for (int i = 0; i < 10; i++) {
                System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                        persons[i][0],
                        persons[i][1],
                        persons[i][2],
                        bmiStatus[i]);
            }
        }
    }
}
