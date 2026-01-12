package voting.impl;

public class Vote {
    public Vote(Voter voter, Candidate candidate)
            throws DuplicateVoteException {
        if (voter.hasVoted())
            throw new DuplicateVoteException("Duplicate vote detected");

        candidate.addVote();
        voter.markVoted();
    }
}
