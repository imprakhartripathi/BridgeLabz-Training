// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
// Hint => 
// Take user input for the age and height of the 3 friends and store it in a variable
// Find the smallest of the 3 ages to find the youngest friend and display it
// Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age and height of Amar:");
            int ageAmar = sc.nextInt();
            double heightAmar = sc.nextDouble();

            System.out.println("Enter the age and height of Akbar:");
            int ageAkbar = sc.nextInt();
            double heightAkbar = sc.nextDouble();

            System.out.println("Enter the age and height of Anthony:");
            int ageAnthony = sc.nextInt();
            double heightAnthony = sc.nextDouble();

            // Find youngest friend
            if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
                System.out.println("Amar is the youngest.");
            } else if (ageAkbar < ageAnthony) {
                System.out.println("Akbar is the youngest.");
            } else {
                System.out.println("Anthony is the youngest.");
            }

            // Find tallest friend
            if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
                System.out.println("Amar is the tallest.");
            } else if (heightAkbar > heightAnthony) {
                System.out.println("Akbar is the tallest.");
            } else {
                System.out.println("Anthony is the tallest.");
            }
        }
    }
}