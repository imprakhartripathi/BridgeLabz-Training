package voting.impl;

public class Candidate {
    private String name;
    private int votes = 0;

    public Candidate(String name) {
        this.name = name;
    }

    public void addVote() {
        votes++;
    }

    public int getVotes() {
        return votes;
    }

    public String getName() {
        return name;
    }
}
