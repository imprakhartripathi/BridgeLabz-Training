// Sandeep’s Fitness Challenge Tracker
// Each day Sandeep completes a number of push-ups.
// Store counts for a week.
// Use for-each to calculate total and average.
// Use continue to skip rest days.

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] pushUps = new int[7];

            System.out.println("Enter push ups for 7 days (enter 0 for rest day)");

            for (int i = 0; i < 7; i++) {
                pushUps[i] = sc.nextInt();
            }

            int total = 0;
            int activeDays = 0;

            for (int count : pushUps) {
                if (count == 0) {
                    continue;
                }
                total += count;
                activeDays++;
            }

            double average = 0;
            if (activeDays > 0) {
                average = total / (double) activeDays;
            }

            System.out.println("Total push ups " + total);
            System.out.println("Average push ups " + average);
        }
    }
}
