package examproctor.impl;

import java.util.HashMap;
import java.util.Stack;

public class ExamSession {

    private Stack<Integer> navigation = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    public void visitQuestion(int qId) {
        navigation.push(qId);
    }

    public int getLastVisited() {
        return navigation.isEmpty() ? -1 : navigation.peek();
    }

    public void submitAnswer(int qId, String answer) {
        answers.put(qId, answer);
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}
