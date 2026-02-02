package lambda;

import java.util.Scanner;

public class SmartLighting {

    interface LightAction {
        void activate();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Smart Lighting Control ===");
        System.out.println("Choose trigger:");
        System.out.println("1. Motion detected");
        System.out.println("2. Voice command");
        System.out.println("3. Night time automation");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();

        LightAction action;

        action = switch (choice) {
            case 1 -> () -> System.out.println("Lights turned ON due to motion detection.");
            case 2 -> () -> System.out.println("Lights turned ON via voice command.");
            case 3 -> () -> System.out.println("Dim lights activated for night mode.");
            default -> () -> System.out.println("Invalid trigger selected.");
        };

        action.activate();
    }
}
