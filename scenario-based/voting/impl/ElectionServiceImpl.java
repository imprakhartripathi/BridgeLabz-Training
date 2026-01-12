package voting.impl;

public class ElectionServiceImpl extends ElectionService {
    public void castVote(Voter v, Candidate c)
            throws DuplicateVoteException {
        new Vote(v, c);
    }
}
