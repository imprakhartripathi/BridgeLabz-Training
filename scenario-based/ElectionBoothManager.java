// Election Booth Manager ️
// Design a polling booth system.
// ● Take age input.
// ● Use if to check if eligible (>=18).
// ● Record vote (1, 2, or 3 for candidates).
// ● Loop for multiple voters, exit on special code.

import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int candidate1Votes = 0;
            int candidate2Votes = 0;
            int candidate3Votes = 0;
            
            while (true) {
                System.out.print("Enter age (enter -1 to stop voting): ");
                int age = sc.nextInt();
                
                // Exit condition
                if (age == -1) {
                    break;
                }
                
                // Eligibility check
                if (age < 18) {
                    System.out.println("Not eligible to vote.");
                    continue;
                }
                
                System.out.println("Eligible to vote.");
                System.out.println("Cast your vote:");
                System.out.println("1 - Candidate 1");
                System.out.println("2 - Candidate 2");
                System.out.println("3 - Candidate 3");
                
                System.out.print("Enter your choice (1-3): ");
                int vote = sc.nextInt();
                
                // Record vote
                switch (vote) {
                    case 1 -> candidate1Votes++;
                    case 2 -> candidate2Votes++;
                    case 3 -> candidate3Votes++;
                    default -> System.out.println("Invalid vote. Vote not recorded.");
                }
            }
            
            // Final results
            System.out.println("\nVoting Closed.");
            System.out.println("Election Results:");
            System.out.println("Candidate 1: " + candidate1Votes + " votes");
            System.out.println("Candidate 2: " + candidate2Votes + " votes");
            System.out.println("Candidate 3: " + candidate3Votes + " votes");
        }
    }
}
