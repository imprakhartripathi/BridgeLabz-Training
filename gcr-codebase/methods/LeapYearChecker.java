/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/

import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {

        // Gregorian calendar condition
        if (year < 1582) {
            return false;
        }

        // Leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            
            // Checking leap year
            if (isLeapYear(year)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }
}
