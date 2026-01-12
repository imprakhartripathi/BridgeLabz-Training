package exam.impl;

public class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(String answer, Question q) {
        return answer.length() > 10 ? 1 : 0; //simulating that the answer is being read by an actual person
    }
}
