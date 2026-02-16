package onlinehackathon.service;

import onlinehackathon.model.Participant;
import onlinehackathon.exp.LateSubmissionException;

import java.util.*;

public class HackathonService {

    private List<Participant> participants = new ArrayList<>();

    public void addParticipant(Participant participant) throws LateSubmissionException {
        if (participant.isLateSubmission()) {
            throw new LateSubmissionException("Submission rejected: Late submission.");
        }
        participant.calculateScore();
        participants.add(participant);
    }

    public void displayLeaderboard() {
        participants.sort(Comparator.comparingInt(Participant::getScore).reversed());

        System.out.println("===== Leaderboard =====");
        int rank = 1;
        for (Participant p : participants) {
            System.out.println(rank++ + ". " + p.getName() + " - Score: " + p.getScore());
        }
    }
}