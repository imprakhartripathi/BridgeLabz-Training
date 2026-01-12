package exam;

import exam.impl.*;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        Student s = new Student(sc.nextLine());
        Question q = new Question("Java is what kind of language?", "OOP");
        System.out.println("Question: " + q.text);
        EvaluationStrategy eval = new ObjectiveEvaluation();
        Exam exam = new Exam();

        try {
            System.out.print("Enter Answer: ");
            int score = exam.submitAnswer(sc.nextLine(), q, eval, false);
            System.out.println(s.getName() + "'s Score: " + score);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
