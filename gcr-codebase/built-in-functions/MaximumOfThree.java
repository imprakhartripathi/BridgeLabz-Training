// 2. Maximum of Three Numbers:
// ○ Write a program that takes three integer inputs from the user and finds the
// maximum of the three numbers.
// ○ Ensure your program follows best practices for organizing code into modular
// functions, such as separate functions for taking input and calculating the
// maximum value.

import java.util.Scanner;

public class MaximumOfThree {

    static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers");

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = findMaximum(a, b, c);

            System.out.println("Maximum number is " + result);
        }
    }
}
