package stack_queue_hashmap_hashfunctions.impl;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());
        return s2.pop();
    }

    public static void execute(Scanner sc) {
        QueueUsingStacks q = new QueueUsingStacks();
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        while (n-- > 0) {
            System.out.print("1.Enqueue 2.Dequeue: ");
            int ch = sc.nextInt();
            if (ch == 1) q.enqueue(sc.nextInt());
            else System.out.println("Dequeued: " + q.dequeue());
        }
    }
}
