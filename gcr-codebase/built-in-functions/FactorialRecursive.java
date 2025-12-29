// 6. Factorial Using Recursion:
// ○ Write a program that calculates the factorial of a number using a recursive
// function.
// ○ Include modular code to separate input, calculation, and output processes.

import java.util.Scanner;

public class FactorialRecursive {

    static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");

            int num = sc.nextInt();

            int result = factorial(num);

            System.out.println("Factorial is " + result);
        }
    }
}
