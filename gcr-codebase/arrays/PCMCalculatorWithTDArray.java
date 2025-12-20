// Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
// Hint => 
// All the steps are the same as the problem 8 except the marks are stored in a 2D array
// Use the 2D array to calculate the percentages, and grades of the students

import java.util.Scanner;

public class PCMCalculatorWithTDArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of students: ");
            int n = sc.nextInt();

            int[][] marks = new int[n][3]; // 0 - Physics, 1 - Chemistry, 2 - Maths
            double[] percentages = new double[n];
            char[] grades = new char[n];

            for (int i = 0; i < n; i++) {

                System.out.print("Enter physics marks for student " + (i + 1) + ": ");
                marks[i][0] = sc.nextInt();
                while (marks[i][0] < 0) {
                    System.out.print("Please enter a positive value: ");
                    marks[i][0] = sc.nextInt();
                }

                System.out.print("Enter chemistry marks for student " + (i + 1) + ": ");
                marks[i][1] = sc.nextInt();
                while (marks[i][1] < 0) {
                    System.out.print("Please enter a positive value: ");
                    marks[i][1] = sc.nextInt();
                }

                System.out.print("Enter maths marks for student " + (i + 1) + ": ");
                marks[i][2] = sc.nextInt();
                while (marks[i][2] < 0) {
                    System.out.print("Please enter a positive value: ");
                    marks[i][2] = sc.nextInt();
                }

                percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

                if (percentages[i] >= 80) {
                    grades[i] = 'A';
                } else if (percentages[i] >= 70) {
                    grades[i] = 'B';
                } else if (percentages[i] >= 60) {
                    grades[i] = 'C';
                } else if (percentages[i] >= 50) {
                    grades[i] = 'D';
                } else if (percentages[i] >= 40) {
                    grades[i] = 'E';
                } else {
                    grades[i] = 'R';
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(
                        "Student " + (i + 1) +
                                ": Physics = " + marks[i][0] +
                                ", Chemistry = " + marks[i][1] +
                                ", Maths = " + marks[i][2] +
                                ", Percentage = " + percentages[i] +
                                ", Grade = " + grades[i]);
            }

        }
    }
}
