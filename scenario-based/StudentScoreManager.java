import java.util.Scanner;

public class StudentScoreManager {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n;
            try {
                n = inp.nextInt();
                if (n <= 0) {
                    System.out.println("Number of students must be positive.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Expected a number.");
                return;
            }
            double[] scores = new double[n];
            double sum = 0;
            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.print("Enter score for student " + (i + 1) + ": ");
                    try {
                        double score = inp.nextDouble();

                        if (score < 0) {
                            System.out.println("Score cannot be negative. Try again.");
                            continue;
                        }

                        scores[i] = score;
                        sum += score;
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input. Enter a numeric value.");
                        inp.next(); // clear invalid token
                    }
                }
            }
            double avg = sum / n;
            double max = scores[0];
            double min = scores[0];
            for (double s : scores) {
                if (s > max)
                    max = s;
                if (s < min)
                    min = s;
            }
            System.out.println("\nAverage Score: " + avg);
            System.out.println("Highest Score: " + max);
            System.out.println("Lowest Score: " + min);
            System.out.println("Scores above average:");
            for (double s : scores) {
                if (s > avg) {
                    System.out.println(s);
                }
            }
        }
    }
}
