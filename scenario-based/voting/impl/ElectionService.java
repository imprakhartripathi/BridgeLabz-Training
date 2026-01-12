package voting.impl;

public abstract class ElectionService {
    public abstract void castVote(Voter v, Candidate c)
            throws DuplicateVoteException;
}
