import java.util.Scanner;

public class EduQuiz {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] correctAnswers = {
                "A", "C", "B", "D", "A",
                "B", "C", "D", "A", "B"
            };
            
            String[] studentAnswers = new String[10];
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter answer for Question " + (i + 1) + ": ");
                studentAnswers[i] = sc.nextLine();
            }
            
            int score = calculateScore(correctAnswers, studentAnswers);
            double percentage = (score / 10.0) * 100;
            
            System.out.println("\nFinal Score: " + score + "/10");
            System.out.println("Percentage: " + percentage + "%");
            
            if (percentage >= 50) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }
        }
    }

    static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }
}
