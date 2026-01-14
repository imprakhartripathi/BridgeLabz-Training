package stack_queue_hashmap_hashfunctions.impl;

import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursion {

    public static void execute(Scanner sc) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        while (n-- > 0)
            stack.push(sc.nextInt());

        sort(stack);
        System.out.println(stack);
    }

    private static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sort(stack);
            insert(stack, x);
        }
    }

    private static void insert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insert(stack, x);
        stack.push(temp);
    }
}
