package runtimeanalysis;

import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {
        int n = 1_000_000;
        int target = n - 1;

        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, arrayTime, hashSetTime, treeSetTime;

        // Array search (O(N))
        start = System.nanoTime();
        for (int x : array) {
            if (x == target) break;
        }
        arrayTime = System.nanoTime() - start;

        // HashSet search (O(1) avg)
        start = System.nanoTime();
        hashSet.contains(target);
        hashSetTime = System.nanoTime() - start;

        // TreeSet search (O(log N))
        start = System.nanoTime();
        treeSet.contains(target);
        treeSetTime = System.nanoTime() - start;

        System.out.println("\n\n--------Search Performance Comparison--------");
        System.out.printf("Array    : %d ns\n", arrayTime);
        System.out.printf("HashSet  : %d ns\n", hashSetTime);
        System.out.printf("TreeSet  : %d ns", treeSetTime);

        // Determine fastest
        long fastest = Math.min(arrayTime, Math.min(hashSetTime, treeSetTime));

        System.out.print("\n\nFastest Data Structure: ");
        if (fastest == hashSetTime) {
            System.out.print("HashSet (O(1) average time)");
        } else if (fastest == treeSetTime) {
            System.out.print("TreeSet (O(log N))");
        } else {
            System.out.print("Array (O(N))");
        }
    }
}
