package sorting.impl;

public class CountingSort {

    public static void sort(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;

        int[] count = new int[max + 1];

        for (int x : arr) count[x]++;
        int idx = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) arr[idx++] = i;
        }

        printComplexity();
    }

    private static void printComplexity() {
        System.out.println("""
        Time Complexity:
        Best Case    : O(n + k)
        Average Case : O(n + k)
        Worst Case   : O(n + k)
        """);
    }
}
