package voting.impl;

public class Voter {
    private int id;
    private boolean hasVoted = false;

    public Voter(int id) {
        this.id = id;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void markVoted() {
        hasVoted = true;
    }
}
