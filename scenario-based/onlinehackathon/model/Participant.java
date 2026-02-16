package onlinehackathon.model;

import java.util.Map;

public class Participant {

    private String name;
    private Map<String, Boolean> testCaseResults;
    private boolean lateSubmission;
    private int score;

    public Participant(String name, Map<String, Boolean> testCaseResults, boolean lateSubmission) {
        this.name = name;
        this.testCaseResults = testCaseResults;
        this.lateSubmission = lateSubmission;
    }

    public int calculateScore() {
        int total = 0;
        for (Boolean passed : testCaseResults.values()) {
            if (passed) total += 10; // each question = 10 marks
        }
        this.score = total;
        return total;
    }

    public String getName() { return name; }
    public boolean isLateSubmission() { return lateSubmission; }
    public int getScore() { return score; }
}