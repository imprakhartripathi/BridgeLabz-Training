package stack_queue_hashmap_hashfunctions.impl;

import java.util.*;

public class PairWithGivenSum {

    public static void execute(Scanner sc) {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(target - x)) {
                System.out.println("Pair exists");
                return;
            }
            set.add(x);
        }
        System.out.println("No pair");
    }
}
