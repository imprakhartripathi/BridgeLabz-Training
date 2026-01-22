package queue;

import java.util.*;

class StackUsingQueuesImpl {
    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();

    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        return q1.remove();
    }

    int top() {
        return q1.peek();
    }
}

public class StackUsingQueues {
    public static void main(String[] args) {

        StackUsingQueuesImpl stack = new StackUsingQueuesImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
    }
}
