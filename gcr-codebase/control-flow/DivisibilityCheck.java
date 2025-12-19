// Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); 

            if (number % 5 == 0) {
                System.out.println("Is the number " + number + " divisible by 5? Yes");
            } else {
                System.out.println("Is the number " + number + " divisible by 5? No");
            }
        }
    }
}
