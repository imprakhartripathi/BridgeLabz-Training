// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
// Hint => 
// Spring Season is from March 20 to June 20

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month (in numbers): ");
            int month = sc.nextInt();
            System.out.print("Enter day: ");
            int day = sc.nextInt();

            if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
    }
}
