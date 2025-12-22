// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below
//Grade A: Level 4, above agency-normalized standards; marks of 80% and above.
//Grade B: Level 3, at agency-normalized standards; marks of 70% to 79%.
//Grade C: Level 2, below but approaching agency-normalized standards; marks of 60% to 69%.
//Grade D: Level 1, well below agency-normalized standards; marks of 50% to 59%.
//Grade E: Level 1-, too below agency-normalized standards; marks of 40% to 49%.
//Grade R: Remedial standards; marks of 39% and below.
// Hint => 
// Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
// Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
// Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
// Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 


import java.util.Random;

public class MarksCalculator {

    static final int SUBJECTS = 3; // Physics, Chemistry, Maths

    public static void main(String[] args) {
        int students = 5;

        int[][] scores = generateScores(students);
        double[][] calculations = calculateScores(scores);
        char[] grades = calculateGrades(calculations);
        displayScoreCard(scores, calculations, grades);
    }

    // 1. Generate random 2-digit PCM scores
    static int[][] generateScores(int students) {
        int[][] scores = new int[students][SUBJECTS];
        Random random = new Random();

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < SUBJECTS; j++) {
                scores[i][j] = random.nextInt(51) + 50; // 50–100
            }
        }
        return scores;
    }

    // 2. Calculate Total, Average, Percentage
    static double[][] calculateScores(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                total += scores[i][j];
            }

            double average = total / (double) SUBJECTS;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // 3. Calculate Grades
    static char[] calculateGrades(double[][] calculations) {
        char[] grades = new char[calculations.length];

        for (int i = 0; i < calculations.length; i++) {
            double percent = calculations[i][2];

            if (percent >= 80) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else if (percent >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // 4. Display Scorecard
    static void displayScoreCard(int[][] scores, double[][] calculations, char[] grades) {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Total | Average  | Percentage  | Grade");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("   %d    |   %d    |    %d     |  %d   |  %.0f  |  %.2f   |   %.2f%%    |   %c%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    calculations[i][0],
                    calculations[i][1],
                    calculations[i][2],
                    grades[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }
}

