package queue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);
        System.out.println(queue);
    }

    private static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) return;

        int front = queue.remove();
        reverse(queue);
        queue.add(front);
    }
}
