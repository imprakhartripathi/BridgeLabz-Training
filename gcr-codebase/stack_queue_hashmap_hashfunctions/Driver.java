package stack_queue_hashmap_hashfunctions;

import java.util.Scanner;
import stack_queue_hashmap_hashfunctions.impl.*;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.QueueUsingStacks\n2.SortStack\n3.StockSpan\n4.SlidingWindowMax\n5.CircularTour\n6.ZeroSumSubarrays\n7.PairWithSum\n8.LongestConsecutive\n9.TwoSum\n10.CustomHashMap\n0.Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> QueueUsingStacks.execute(sc);
                case 2 -> SortStackRecursion.execute(sc);
                case 3 -> StockSpan.execute(sc);
                case 4 -> SlidingWindowMaximum.execute(sc);
                case 5 -> CircularTour.execute(sc);
                case 6 -> ZeroSumSubarrays.execute(sc);
                case 7 -> PairWithGivenSum.execute(sc);
                case 8 -> LongestConsecutiveSequence.execute(sc);
                case 9 -> TwoSum.execute(sc);
                case 10 -> CustomHashMap.execute(sc);
                case 0 -> {
                    System.out.println("Exiting.");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
