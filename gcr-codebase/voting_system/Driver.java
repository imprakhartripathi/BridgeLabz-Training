package voting_system;

import voting_system.impl.VotingService;

public class Driver {
    public static void main(String[] args) {

        VotingService votingService = new VotingService();

        votingService.vote("Denzel");
        votingService.vote("TheRock");
        votingService.vote("Denzel");
        votingService.vote("Ryan");
        votingService.vote("TheRock");
        votingService.vote("Denzel");

        System.out.println();
        votingService.printVotesInInsertionOrder();

        System.out.println();
        votingService.printVotesSortedByCandidate();

        System.out.println();
        votingService.printVotesSortedByCountDescending();
    }
}
