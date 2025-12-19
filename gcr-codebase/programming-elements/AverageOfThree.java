import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            // Calculate average: sum of all numbers divided by count
            double avg = (a + b + c) / 3;
            System.out.println(avg);
        }
    }
}
