package queue;

import java.util.*;

class CircularQueue {
    private int[] buffer;
    private int size;
    private int index = 0;
    private int count = 0;

    CircularQueue(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void add(int value) {
        buffer[index] = value;
        index = (index + 1) % size;
        if (count < size) count++;
    }

    List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(index + i) % size]);
        }
        return result;
    }
}

public class CircularBuffer {
    public static void main(String[] args) {

        CircularQueue buffer = new CircularQueue(3);
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4);

        System.out.println(buffer.getBuffer()); // [2, 3, 4]
    }
}
