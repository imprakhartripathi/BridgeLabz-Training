package runtimeanalysis;

public class SearchComparison {

    public static void linearSearch(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) return;
        }
    }

    public static void binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = i;
        }

        int target = n - 1;

        long start, linearTime, binaryTime;

        start = System.nanoTime();
        linearSearch(data, target);
        linearTime = System.nanoTime() - start;

        start = System.nanoTime();
        binarySearch(data, target);
        binaryTime = System.nanoTime() - start;

        System.out.println("\n\n--------Search Algorithm Performance Comparison--------");
        System.out.printf("Linear Search : %d ns\n", linearTime);
        System.out.printf("Binary Search : %d ns", binaryTime);

        System.out.print("\n\nFastest Algorithm: ");
        if (binaryTime < linearTime) {
            System.out.print("Binary Search (O(log N))");
        } else {
            System.out.print("Linear Search (O(N))");
        }
    }
}
