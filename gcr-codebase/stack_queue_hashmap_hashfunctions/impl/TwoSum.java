package stack_queue_hashmap_hashfunctions.impl;

import java.util.*;

public class TwoSum {

    public static void execute(Scanner sc) {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }
}
