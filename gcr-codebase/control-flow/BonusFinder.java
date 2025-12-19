// Create a program to find the bonuses of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.

import java.util.Scanner;

public class BonusFinder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter the years of service: ");
            int yearsOfService = sc.nextInt();

            if (yearsOfService > 5) {
                double bonus = salary * 0.05;
                System.out.println("The bonus amount is: " + bonus);
            } else {
                System.out.println("No bonus is applicable.");
            }
        }
    }
}