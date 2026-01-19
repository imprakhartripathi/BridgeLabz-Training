package parceltracker;

import java.util.Scanner;
import parceltracker.impl.ParcelTracker;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        while (true) {
            System.out.println("\n--- Parcel Tracker Menu ---");
            System.out.println("1. Add Stage");
            System.out.println("2. Add Checkpoint After Stage");
            System.out.println("3. Display Tracking");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter stage name: ");
                    tracker.addStage(sc.nextLine());
                }

                case 2 -> {
                    System.out.print("Enter existing stage: ");
                    String existing = sc.nextLine();
                    System.out.print("Enter checkpoint name: ");
                    String checkpoint = sc.nextLine();

                    if (!tracker.addCheckpointAfter(existing, checkpoint)) {
                        System.out.println("Stage not found.");
                    }
                }

                case 3 -> tracker.displayTracking();

                case 4 -> {
                    System.out.println("Exiting Parcel Tracker.");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
