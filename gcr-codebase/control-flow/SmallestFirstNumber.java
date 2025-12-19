// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____

import java.util.Scanner;

public class SmallestFirstNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();

            if (num1 < num2 && num1 < num3) {
                System.out.println("Is the first number the smallest? Yes");
            } else {
                System.out.println("Is the first number the smallest? No");
            }
        }
    }
}