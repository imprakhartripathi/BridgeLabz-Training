package stack_queue_hashmap_hashfunctions.impl;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void execute(Scanner sc) {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);

        int longest = 0;

        for (int x : arr) {
            if (!set.contains(x - 1)) {
                int curr = x, count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}
