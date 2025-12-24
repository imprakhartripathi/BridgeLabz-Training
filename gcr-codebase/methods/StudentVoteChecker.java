/*
Program:
Take user input for the age of all 10 students in a class and check whether
each student can vote based on age >= 18.

Logic:
- If age is negative → cannot vote
- If age >= 18 → can vote
- Else → cannot vote
*/

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false; // Invalid age
        }

        if (age >= 18) {
            return true; // Eligible to vote
        }

        return false; // Not eligible
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            StudentVoteChecker checker = new StudentVoteChecker();
            
            int[] ages = new int[10];
            
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                ages[i] = sc.nextInt();
                
                boolean canVote = checker.canStudentVote(ages[i]);
                
                if (canVote) {
                    System.out.println("Student " + (i + 1) + " can vote.");
                } else {
                    System.out.println("Student " + (i + 1) + " cannot vote.");
                }
            }
        }
    }
}
