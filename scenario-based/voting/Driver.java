package voting;

import voting.impl.*;

public class Driver {
    public static void main(String[] args) {
        Voter voter = new Voter(1);
        Candidate c1 = new Candidate("Jay Prakash");

        ElectionService service = new ElectionServiceImpl();

        try {
            service.castVote(voter, c1);
            service.castVote(voter, c1);
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(c1.getName() + " votes: " + c1.getVotes());
    }
}
