/*
Program:
Generate scorecard for students based on Physics, Chemistry, and Maths scores.
Calculate total, average, and percentage and display in tabular format.
*/

import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores
    // Columns: 0 → Physics, 1 → Chemistry, 2 → Maths
    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate Total, Average, and Percentage
    // Columns: 0 → Total, 1 → Average, 2 → Percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {

    System.out.println("-------------------------------------------------------------------------------");
    System.out.printf("%-4s %-8s %-11s %-7s %-7s %-9s %-11s%n",
            "Stu", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
    System.out.println("-------------------------------------------------------------------------------");

    for (int i = 0; i < scores.length; i++) {
        System.out.printf(
                "%-4d %-8d %-11d %-7d %-7d %-9.2f %-11.2f%n",
                (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                (int) results[i][0],
                results[i][1],
                results[i][2]
        );
    }

    System.out.println("-------------------------------------------------------------------------------");
}


    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int students = sc.nextInt();
            
            int[][] pcmScores = generatePCMScores(students);
            double[][] results = calculateResults(pcmScores);
            
            displayScorecard(pcmScores, results);
        }
    }
}
