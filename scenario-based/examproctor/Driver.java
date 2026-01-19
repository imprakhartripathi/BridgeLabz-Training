package examproctor;

import examproctor.impl.ExamSession;
import examproctor.impl.ScoringService;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamSession session = new ExamSession();
        HashMap<Integer, String> correctAnswers = new HashMap<>();

        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Correct answer for Q" + i + ": ");
            correctAnswers.put(i, sc.nextLine());
        }

        while (true) {
            System.out.println("\n--- Exam Proctor Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Submit Answer");
            System.out.println("3. View Last Visited Question");
            System.out.println("4. Submit Exam");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter question ID: ");
                    session.visitQuestion(sc.nextInt());
                }

                case 2 -> {
                    System.out.print("Enter question ID: ");
                    int qId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter answer: ");
                    session.submitAnswer(qId, sc.nextLine());
                }

                case 3 -> {
                    int last = session.getLastVisited();
                    System.out.println(last == -1 ? "No navigation yet." :
                            "Last Visited Question: " + last);
                }

                case 4 -> {
                    int score = ScoringService.evaluate(
                            session.getAnswers(),
                            correctAnswers
                    );
                    System.out.println("Final Score: " + score);
                }

                case 5 -> {
                    System.out.println("Exiting Exam Proctor.");
                    return;
                }

                default -> System.out.println("Invalid option.");
            }
        }
    }
}
