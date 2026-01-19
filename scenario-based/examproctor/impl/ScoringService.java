package examproctor.impl;

import java.util.HashMap;

public class ScoringService {

    public static int evaluate(HashMap<Integer, String> submitted,
                               HashMap<Integer, String> correct) {

        int score = 0;
        for (Integer qId : correct.keySet()) {
            if (correct.get(qId).equalsIgnoreCase(submitted.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
