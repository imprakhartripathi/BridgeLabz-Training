package onlinehackathon;

import onlinehackathon.exp.LateSubmissionException;
import onlinehackathon.model.Participant;
import onlinehackathon.service.HackathonService;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HackathonService service = new HackathonService();

        Map<String, Boolean> result1 = new HashMap<>();
        result1.put("Q1", true);
        result1.put("Q2", true);
        result1.put("Q3", false);

        Map<String, Boolean> result2 = new HashMap<>();
        result2.put("Q1", true);
        result2.put("Q2", false);
        result2.put("Q3", true);

        try {
            service.addParticipant(new Participant("Alice", result1, false));
            service.addParticipant(new Participant("Bob", result2, false));
            service.addParticipant(new Participant("Charlie", result2, true)); // will throw
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        }

        service.displayLeaderboard();
    }
}