package stack_queue_hashmap_hashfunctions.impl;

import java.util.Scanner;

public class CircularTour {

    public static void execute(Scanner sc) {
        System.out.print("Enter pumps: ");
        int n = sc.nextInt();
        int[] petrol = new int[n];
        int[] dist = new int[n];

        for (int i = 0; i < n; i++) petrol[i] = sc.nextInt();
        for (int i = 0; i < n; i++) dist[i] = sc.nextInt();

        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - dist[i];
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        System.out.println(surplus + deficit >= 0 ? start : -1);
    }
}
