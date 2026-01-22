package voting_system.impl;

import java.util.*;

public class VotingService {

    // Candidate -> Votes (fast updates)
    private final Map<String, Integer> voteMap = new HashMap<>();

    // Maintain vote order (who received votes first)
    private final Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();

    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        insertionOrderMap.put(candidate, voteMap.get(candidate));
    }

    public void printVotesInInsertionOrder() {
        System.out.println("Votes (Insertion Order):");
        for (Map.Entry<String, Integer> entry : insertionOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void printVotesSortedByCandidate() {
        System.out.println("Votes (Sorted by Candidate):");
        TreeMap<String, Integer> sorted = new TreeMap<>(voteMap);
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void printVotesSortedByCountDescending() {
        System.out.println("Votes (Sorted by Count Desc):");

        TreeMap<Integer, List<String>> sortedByVotes = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            sortedByVotes
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        for (Map.Entry<Integer, List<String>> entry : sortedByVotes.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + " -> " + entry.getKey());
            }
        }
    }
}
