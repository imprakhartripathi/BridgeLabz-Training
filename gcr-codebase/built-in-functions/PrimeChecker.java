// 3. Prime Number Checker:
// ○ Create a program that checks whether a given number is a prime number.
// ○ The program should use a separate function to perform the prime check and
// return the result.

import java.util.Scanner;

public class PrimeChecker {

    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");

            int num = sc.nextInt();

            if (isPrime(num)) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
    }
}
