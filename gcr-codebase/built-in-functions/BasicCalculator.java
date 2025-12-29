// 9. Basic Calculator:
// ○ Write a program that performs basic mathematical operations (addition,
// subtraction, multiplication, division) based on user input.
// ○ Each operation should be performed in its own function, and the program
// should prompt the user to choose which operation to perform.

import java.util.Scanner;

public class BasicCalculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Choose operation add sub mul div");

            String op = sc.next();

            switch (op) {
                case "add" -> System.out.println(add(a, b));
                case "sub" -> System.out.println(subtract(a, b));
                case "mul" -> System.out.println(multiply(a, b));
                default -> System.out.println(divide(a, b));
            }
        }
    }
}
