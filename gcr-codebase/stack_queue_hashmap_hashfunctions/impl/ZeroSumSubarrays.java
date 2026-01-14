package stack_queue_hashmap_hashfunctions.impl;

import java.util.*;

public class ZeroSumSubarrays {

    public static void execute(Scanner sc) {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);

        for (int x : arr) {
            sum += x;
            if (map.containsKey(sum))
                System.out.println("Zero sum subarray exists");
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
    }
}
