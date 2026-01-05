import java.util.Scanner;

public class MathUtilityApp {

    static class MathUtils {

        public static long factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Negative numbers not allowed");
            }
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static boolean isPrime(int n) {
            if (n <= 1)
                return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        public static int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static int fibonacci(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Negative index not allowed");
            }
            if (n == 0)
                return 0;
            if (n == 1)
                return 1;

            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int sum = a + b;
                a = b;
                b = sum;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\n--- Math Utility Menu ---");
                System.out.println("1. Factorial");
                System.out.println("2. Prime Check");
                System.out.println("3. GCD");
                System.out.println("4. Fibonacci");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                choice = sc.nextInt();
                
                try {
                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter number: ");
                            int factNum = sc.nextInt();
                            System.out.println("Factorial: " + MathUtils.factorial(factNum));
                        }
                        
                        case 2 -> {
                            System.out.print("Enter number: ");
                            int primeNum = sc.nextInt();
                            System.out.println("Is Prime: " + MathUtils.isPrime(primeNum));
                        }
                        
                        case 3 -> {
                            System.out.print("Enter first number: ");
                            int a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            int b = sc.nextInt();
                            System.out.println("GCD: " + MathUtils.gcd(a, b));
                        }
                        
                        case 4 -> {
                            System.out.print("Enter n: ");
                            int fibNum = sc.nextInt();
                            System.out.println("Fibonacci: " + MathUtils.fibonacci(fibNum));
                        }
                        
                        case 5 -> System.out.println("Exiting Math Utility App.");
                        
                        default -> System.out.println("Invalid choice. Try again.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } while (choice != 5);
        }
    }
}
