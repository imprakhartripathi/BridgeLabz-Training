// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
// Hint => 
// Take input for a number of persons
// Create arrays to store the weight, height, BMI, and weight status of the persons
// Take input for the weight and height of the persons
// Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
// Display the height, weight, BMI, and weight status of each person
// Use the table to determine the weight status of the person
// * **BMI ≤ 18.4** → Underweight
// * **BMI 18.5 – 24.9** → Normal
// * **BMI 25.0 – 39.9** → Overweight
// * **BMI ≥ 40.0** → Obese

import java.util.Scanner;

public class BMIWithArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of persons: ");
            int n = sc.nextInt();
            
            double[] weights = new double[n];
            double[] heights = new double[n];
            double[] bmis = new double[n];
            String[] statuses = new String[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weights[i] = sc.nextDouble();
                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
                
                bmis[i] = weights[i] / (heights[i] * heights[i]);
                
                if (bmis[i] <= 18.4) {
                    statuses[i] = "Underweight";
                } else if (bmis[i] <= 24.9) {
                    statuses[i] = "Normal";
                } else if (bmis[i] <= 39.9) {
                    statuses[i] = "Overweight";
                } else {
                    statuses[i] = "Obese";
                }
            }
            
            System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                        (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
            }
        }
    }
}
