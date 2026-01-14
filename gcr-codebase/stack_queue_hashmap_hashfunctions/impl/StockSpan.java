package stack_queue_hashmap_hashfunctions.impl;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static void execute(Scanner sc) {
        System.out.print("Enter days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i])
                stack.pop();
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        for (int s : span) System.out.print(s + " ");
        System.out.println();
    }
}
