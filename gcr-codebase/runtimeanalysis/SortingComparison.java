package runtimeanalysis;

import java.util.*;

public class SortingComparison {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int n = 10_000;
        Random r = new Random();

        int[] arr1 = r.ints(n).toArray();
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        long start, bubbleTime, mergeTime, quickTime;

        start = System.nanoTime();
        bubbleSort(arr1);
        bubbleTime = System.nanoTime() - start;

        start = System.nanoTime();
        mergeSort(arr2);
        mergeTime = System.nanoTime() - start;

        start = System.nanoTime();
        quickSort(arr3);
        quickTime = System.nanoTime() - start;

        System.out.println("\n\n--------Sorting Algorithm Performance Comparison--------");
        System.out.printf("Bubble Sort : %d ns\n", bubbleTime);
        System.out.printf("Merge Sort  : %d ns\n", mergeTime);
        System.out.printf("Quick Sort  : %d ns", quickTime);

        long fastest = Math.min(bubbleTime, Math.min(mergeTime, quickTime));

        System.out.print("\n\nFastest Algorithm: ");
        if (fastest == bubbleTime) {
            System.out.print("Bubble Sort (O(N^2))");
        } else if (fastest == quickTime) {
            System.out.print("Quick Sort (O(N log N) average)");
        } else {
            System.out.print("Merge Sort (O(N log N))");
        }
    }
}
