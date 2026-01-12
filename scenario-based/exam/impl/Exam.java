package exam.impl;

public class Exam {
    public int submitAnswer(String answer, Question q,
                            EvaluationStrategy eval, boolean timeExpired)
            throws ExamTimeExpiredException {

        if (timeExpired)
            throw new ExamTimeExpiredException("Exam time expired");

        return eval.evaluate(answer, q);
    }
}
