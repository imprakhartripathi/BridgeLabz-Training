// Write a program to check if the first, second, or third number is the largest of the three.
// I/P => number1, number2, number3
// O/P => 
// Is the first number the largest? ____
// Is the second number the largest? ___
// Is the third number the largest? ___

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("Is the first number the largest? Yes");
            } else {
                System.out.println("Is the first number the largest? No");
            }

            if (num2 > num1 && num2 > num3) {
                System.out.println("Is the second number the largest? Yes");
            } else {
                System.out.println("Is the second number the largest? No");
            }

            if (num3 > num1 && num3 > num2) {
                System.out.println("Is the third number the largest? Yes");
            } else {
                System.out.println("Is the third number the largest? No");
            }
        }
    }
}