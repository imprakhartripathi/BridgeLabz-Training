/*
Write a program SpringSeason that takes two int values month and day from the command line
and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint =>
Spring Season is from March 20 to June 20.
Write a Method to check for Spring season and return a boolean true or false
*/

import java.util.Scanner;

public class SpringSeasonTwo {

    // Method to check if given date falls in Spring Season
    public static boolean isSpringSeason(int month, int day) {

        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month: ");
            int month = sc.nextInt();
            System.out.print("Enter day: ");
            int day =  sc.nextInt();

            // Checking spring season
            if (isSpringSeason(month, day)) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
    }
}
