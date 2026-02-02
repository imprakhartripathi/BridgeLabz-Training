package streambuzz;

import streambuzz.impl.*;
import java.util.*;

public class Driver {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Choose an option (1–4): ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Please enter a valid number.\n");
                continue;
            }

            switch (choice) {
                case 1 -> registerCreator();
                case 2 -> showTopPosts();
                case 3 -> calculateAverage();
                case 4 -> {
                    System.out.println("\nLogging off........");
                    return;
                }
                default -> System.out.println("Invalid choice. Please select between 1 and 4.\n");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n================ StreamBuzz Dashboard ================");
        System.out.println("1. Register Creator");
        System.out.println("2. Show Top Posts");
        System.out.println("3. Calculate Average Likes");
        System.out.println("4. Exit");
        System.out.println("======================================================");
    }

    static void registerCreator() {
        CreatorStats creator = new CreatorStats();
        sc.nextLine();

        System.out.print("Enter creator name: ");
        creator.creatorName = sc.nextLine();

        creator.weeklyLikes = new double[4];
        System.out.println("Enter weekly likes (Week 1 to Week 4):");

        for (int i = 0; i < 4; i++) {
            while (true) {
                try {
                    System.out.print("  Week " + (i + 1) + ": ");
                    creator.weeklyLikes[i] = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("  Please enter a numeric value.");
                }
            }
        }

        CreatorStats.EngagementBoard.add(creator);
        System.out.println("✔ Creator registered successfully\n");
    }

    static void showTopPosts() {
        if (CreatorStats.EngagementBoard.isEmpty()) {
            System.out.println("No creators registered yet.\n");
            return;
        }

        System.out.print("Enter like threshold: ");
        double threshold;

        try {
            threshold = sc.nextDouble();
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Threshold must be a number.\n");
            return;
        }

        boolean found = false;
        System.out.println("\nTop Performing Posts:");

        for (CreatorStats c : CreatorStats.EngagementBoard) {
            int count = 0;
            for (double likes : c.weeklyLikes) {
                if (likes >= threshold) count++;
            }

            if (count > 0) {
                System.out.println("- " + c.creatorName + " : " + count + " week(s)");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No top-performing posts this week.");
        }

        System.out.println();
    }

    static void calculateAverage() {
        if (CreatorStats.EngagementBoard.isEmpty()) {
            System.out.println("No data available to calculate average.\n");
            return;
        }

        double sum = 0;
        int count = 0;

        for (CreatorStats c : CreatorStats.EngagementBoard) {
            for (double likes : c.weeklyLikes) {
                sum += likes;
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Overall average weekly likes: " + average + "\n");
    }
}
