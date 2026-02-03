package streamapi;

import java.util.List;

public class EmailNotifications {

    public static void main(String[] args) {

        List<String> emails = List.of("a@test.com", "b@test.com");

        emails.forEach(email ->
                System.out.println("Sending notification to " + email)
        );
    }
}
