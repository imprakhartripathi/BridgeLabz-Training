// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
// Hint => 
// Take input for a number of persons
// Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//        double[][] personData = new double[number][3];
//        String[] weightStatus = new String[number];
// Take input for weight and height of the persons and for negative values, ask the user to enter positive values
// Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
// Display the height, weight, BMI and status of each person

import java.util.Scanner;

public class BMIWithMDArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of persons: ");
            int n = sc.nextInt();

            double[][] personData = new double[n][3];
            String[] weightStatus = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                double weight = sc.nextDouble();
                while (weight <= 0) {
                    System.out.print("Please enter a positive weight: ");
                    weight = sc.nextDouble();
                }
                personData[i][0] = weight;

                System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                double height = sc.nextDouble();
                while (height <= 0) {
                    System.out.print("Please enter a positive height: ");
                    height = sc.nextDouble();
                }
                personData[i][1] = height;

                personData[i][2] = weight / (height * height);

                if (personData[i][2] <= 18.4) {
                    weightStatus[i] = "Underweight";
                } else if (personData[i][2] <= 24.9) {
                    weightStatus[i] = "Normal";
                } else if (personData[i][2] <= 39.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                        (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
            }
        }
    }
}