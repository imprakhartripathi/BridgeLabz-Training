// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
//Grade A: Level 4, above agency-normalized standards; marks of 80% and above.
//Grade B: Level 3, at agency-normalized standards; marks of 70% to 79%.
//Grade C: Level 2, below but approaching agency-normalized standards; marks of 60% to 69%.
//Grade D: Level 1, well below agency-normalized standards; marks of 50% to 59%.
//Grade E: Level 1-, too below agency-normalized standards; marks of 40% to 49%.
//Grade R: Remedial standards; marks of 39% and below.
// Hint => 
// Take input for the number of students
// Create arrays to store marks, percentages, and grades of the students
// Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
// Calculate the percentage and grade of the students based on the percentage
// Display the marks, percentages, and grades of each student

import java.util.Scanner;

public class PCMCalculatorWithArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int n = sc.nextInt();

            int[] physicsMarks = new int[n];
            int[] chemistryMarks = new int[n];
            int[] mathsMarks = new int[n];
            double[] percentages = new double[n];
            char[] grades = new char[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter physics marks for student " + (i + 1) + ": ");
                physicsMarks[i] = sc.nextInt();
                while (physicsMarks[i] < 0) {
                    System.out.print("Please enter a positive value: ");
                    physicsMarks[i] = sc.nextInt();
                }

                System.out.print("Enter chemistry marks for student " + (i + 1) + ": ");
                chemistryMarks[i] = sc.nextInt();
                while (chemistryMarks[i] < 0) {
                    System.out.print("Please enter a positive value: ");
                    chemistryMarks[i] = sc.nextInt();
                }

                System.out.print("Enter maths marks for student " + (i + 1) + ": ");
                mathsMarks[i] = sc.nextInt();
                while (mathsMarks[i] < 0) {
                    System.out.print("Please enter a positive value: ");
                    mathsMarks[i] = sc.nextInt();
                }

                percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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
                                ": Physics = " + physicsMarks[i] +
                                ", Chemistry = " + chemistryMarks[i] +
                                ", Maths = " + mathsMarks[i] +
                                ", Percentage = " + percentages[i] +
                                ", Grade = " + grades[i]);
            }

        }
    }
}