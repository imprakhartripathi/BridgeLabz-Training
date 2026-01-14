package stack_queue_hashmap_hashfunctions.impl;

import java.util.Scanner;

public class CustomHashMap {

    static class Node {
        int key, value;
        Node(int k, int v) { key = k; value = v; }
    }

    static Node[] table = new Node[10];

    static void put(int key, int value) {
        int idx = key % 10;
        table[idx] = new Node(key, value);
    }

    static int get(int key) {
        int idx = key % 10;
        return table[idx] != null ? table[idx].value : -1;
    }

    public static void execute(Scanner sc) {
        put(sc.nextInt(), sc.nextInt());
        System.out.println(get(sc.nextInt()));
    }
}
