package runtimeanalysis;

public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciIterative(int n) {
        if (n <= 1) return;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        int n = 30;

        long start, recursiveTime, iterativeTime;

        // Recursive Fibonacci (O(2^N))
        start = System.nanoTime();
        fibonacciRecursive(n);
        recursiveTime = System.nanoTime() - start;

        // Iterative Fibonacci (O(N))
        start = System.nanoTime();
        fibonacciIterative(n);
        iterativeTime = System.nanoTime() - start;

        System.out.println("\n\n--------Fibonacci Performance Comparison--------");
        System.out.printf("Recursive : %d ns\n", recursiveTime);
        System.out.printf("Iterative : %d ns", iterativeTime);

        // Determine fastest
        System.out.print("\n\nFastest Approach: ");
        if (iterativeTime < recursiveTime) {
            System.out.print("Iterative (O(N))");
        } else {
            System.out.print("Recursive (O(2^N))");
        }
    }
}
