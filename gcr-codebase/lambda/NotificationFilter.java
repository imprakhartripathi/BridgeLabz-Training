package lambda;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {

    public static void main(String[] args) {
        List<String> notifications = List.of(
                "Emergency Alert",
                "Appointment Reminder",
                "Critical Lab Result",
                "General Update"
        );

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Notification Preferences ===");
        System.out.println("Show notifications of type:");
        System.out.println("1. Critical only");
        System.out.println("2. Emergency only");
        System.out.println("3. Critical + Emergency");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();

        Predicate<String> filter = switch (choice) {
            case 1 -> msg -> msg.contains("Critical");
            case 2 -> msg -> msg.contains("Emergency");
            case 3 -> msg -> msg.contains("Critical") || msg.contains("Emergency");
            default -> msg -> false;
        };

        System.out.println("\nFiltered Notifications:");
        notifications.stream()
                .filter(filter)
                .forEach(n -> System.out.println("- " + n));
    }
}
