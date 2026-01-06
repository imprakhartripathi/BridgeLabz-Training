import java.util.*;

public class QuizResultProcessor {

    static class InvalidQuizSubmissionException extends Exception {
        public InvalidQuizSubmissionException(String msg) {
            super(msg);
        }
    }

    public static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length)
            throw new InvalidQuizSubmissionException("Answer length mismatch.");

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }

    public static String getGrade(int score, int total) {
        double percent = (score * 100.0) / total;

        if (percent >= 80)
            return "A";
        if (percent >= 60)
            return "B";
        if (percent >= 40)
            return "C";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();

        String[] correct = new String[n];
        String[] user = new String[n];

        System.out.println("Enter correct answers:");
        for (int i = 0; i < n; i++) {
            correct[i] = sc.next().toUpperCase();
        }

        System.out.println("Enter user answers:");
        for (int i = 0; i < n; i++) {
            user[i] = sc.next().toUpperCase();
        }

        try {
            int score = calculateScore(correct, user);
            scores.add(score);

            System.out.println("Score: " + score + "/" + n);
            System.out.println("Grade: " + getGrade(score, n));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
