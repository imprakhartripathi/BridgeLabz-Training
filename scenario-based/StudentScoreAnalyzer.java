import java.util.Scanner;

public class StudentScoreAnalyzer {
    
    static class InvalidScoreException extends Exception {
        public InvalidScoreException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter student scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        try {
            System.out.println("Average Score: " + calculateAverage(scores));
            System.out.println("Highest Score: " + findMax(scores));
            System.out.println("Lowest Score: " + findMin(scores));
        } catch (InvalidScoreException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static double calculateAverage(int[] scores) throws InvalidScoreException {
        validateScores(scores);

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static int findMax(int[] scores) throws InvalidScoreException {
        validateScores(scores);

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static int findMin(int[] scores) throws InvalidScoreException {
        validateScores(scores);

        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    private static void validateScores(int[] scores) throws InvalidScoreException {
        if (scores == null || scores.length == 0) {
            throw new InvalidScoreException("Score list cannot be null or empty.");
        }

        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException(
                        "Invalid score detected: " + score + ". Valid range is 0–100.");
            }
        }
    }
}
