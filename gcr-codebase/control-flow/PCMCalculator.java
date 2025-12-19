// Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
//Grade A: Level 4, above agency-normalized standards; marks of 80% and above.
//Grade B: Level 3, at agency-normalized standards; marks of 70% to 79%.
//Grade C: Level 2, below but approaching agency-normalized standards; marks of 60% to 69%.
//Grade D: Level 1, well below agency-normalized standards; marks of 50% to 59%.
//Grade E: Level 1-, too below agency-normalized standards; marks of 40% to 49%.
//Grade R: Remedial standards; marks of 39% and below.
// Hint => 
// Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

import java.util.Scanner;

public class PCMCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Physics marks: ");
            int physics = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            int chemistry = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            int maths = sc.nextInt();

            if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
                System.out.println("Please enter valid marks between 0 and 100.");
                return;
            }

            double average = (physics + chemistry + maths) / 3.0;
            String grade;
            String remarks;

            if (average >= 80) {
                grade = "A";
                remarks = "Level 4 - Above agency-normalized standards";
            } else if (average >= 70) {
                grade = "B";
                remarks = "Level 3 - At agency-normalized standards";
            } else if (average >= 60) {
                grade = "C";
                remarks = "Level 2 - Below but approaching agency-normalized standards";
            } else if (average >= 50) {
                grade = "D";
                remarks = "Level 1 - Well below agency-normalized standards";
            } else if (average >= 40) {
                grade = "E";
                remarks = "Level 1- - Too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            System.out.println("Average Mark: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
