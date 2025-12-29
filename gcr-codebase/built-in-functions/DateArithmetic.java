// 2. Problem 2: Date Arithmetic Create a program that:
// ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
// ➢ Then subtracts 3 weeks from the result.

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter date in format yyyy mm dd");

            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            LocalDate date = LocalDate.of(year, month, day);

            date = date.plusDays(7);
            date = date.plusMonths(1);
            date = date.plusYears(2);

            date = date.minusWeeks(3);

            System.out.println("Final date after all operations is");
            System.out.println(date);
        }
    }
}
