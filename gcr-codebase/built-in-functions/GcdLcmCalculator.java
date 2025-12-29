// 7. GCD and LCM Calculator:
// ○ Create a program that calculates the Greatest Common Divisor (GCD) and Least
// Common Multiple (LCM) of two numbers using functions.
// ○ Use separate functions for GCD and LCM calculations, showcasing how modular
// code works.

import java.util.Scanner;

public class GcdLcmCalculator {

    static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("GCD is " + gcd(a, b));
            System.out.println("LCM is " + lcm(a, b));
        }
    }
}
