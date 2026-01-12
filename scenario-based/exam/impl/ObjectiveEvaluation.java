package exam.impl;

public class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(String answer, Question q) {
        return answer.equalsIgnoreCase(q.getCorrectAnswer()) ? 1 : 0;
    }
}
