package streamapi;

import java.util.List;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees = List.of("Aman", "Riya", "Kunal");

        attendees.forEach(name ->
                System.out.println("Welcome, " + name + "!")
        );
    }
}
