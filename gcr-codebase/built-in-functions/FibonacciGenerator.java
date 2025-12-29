// 4. Fibonacci Sequence Generator:
// ○ Write a program that generates the Fibonacci sequence up to a specified number
// of terms entered by the user.
// ○ Organize the code by creating a function that calculates and prints the
// Fibonacci sequence.

import java.util.Scanner;

public class FibonacciGenerator {

    static void printFibonacci(int terms) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of terms");

            int terms = sc.nextInt();

            printFibonacci(terms);
        }
    }
}
