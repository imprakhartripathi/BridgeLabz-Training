package stack_queue_hashmap_hashfunctions.impl;

import java.util.*;

public class SlidingWindowMaximum {

    public static void execute(Scanner sc) {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peek() <= i - k)
                dq.poll();

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            dq.offer(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peek()] + " ");
        }
        System.out.println();
    }
}
