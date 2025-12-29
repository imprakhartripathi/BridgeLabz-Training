// 4. Problem 4: Date Comparison Write a program that:
// ➢ Takes two date inputs and compares them to check if the first date is before, after,
// or the same as the second date.

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first date in format yyyy mm dd");
            int y1 = sc.nextInt();
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();

            System.out.println("Enter second date in format yyyy mm dd");
            int y2 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            LocalDate dateOne = LocalDate.of(y1, m1, d1);
            LocalDate dateTwo = LocalDate.of(y2, m2, d2);

            if (dateOne.isBefore(dateTwo)) {
                System.out.println("First date is before second date");
            } else if (dateOne.isAfter(dateTwo)) {
                System.out.println("First date is after second date");
            } else {
                System.out.println("Both dates are the same");
            }
        }
    }
}
