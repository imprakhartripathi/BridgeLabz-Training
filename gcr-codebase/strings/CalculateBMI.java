// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
// Hint => 
// Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
// Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
// Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
// Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
 

import java.util.Scanner;

public class CalculateBMI {

    // Method to calculate BMI and Status for a single person
    public static String[] calculateBMI(double weightKg, double heightCm) {

        double heightMeter = heightCm / 100; // convert cm to meters
        double bmi = weightKg / (heightMeter * heightMeter);

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

        return new String[] {
                String.format("%.2f", heightCm),
                String.format("%.2f", weightKg),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method that processes the 2D height-weight array
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] result) {
        System.out.println();
        System.out.printf("%-10s %-10s %-10s %-15s%n",
                "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");

        for (String[] row : result) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    row[0], row[1], row[2], row[3]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double[][] inputData = new double[10][2];
            
            System.out.println("Enter Weight (kg) and Height (cm) for 10 persons:");
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Person " + (i + 1) + ":");
                System.out.print("Weight (kg): ");
                inputData[i][0] = sc.nextDouble();
                
                System.out.print("Height (cm): ");
                inputData[i][1] = sc.nextDouble();
            }
            
            String[][] bmiResult = processBMI(inputData);
            displayResult(bmiResult);
        }
    }
}

