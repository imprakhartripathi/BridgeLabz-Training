package sorting.impl;

public class MergeSort {

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        printComplexity();
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        System.arraycopy(arr, l, left, 0, left.length);
        System.arraycopy(arr, m + 1, right, 0, right.length);

        int i = 0, j = 0, k = l;

        while (i < left.length && j < right.length) {
            arr[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    private static void printComplexity() {
        System.out.println("""
        Time Complexity:
        Best Case    : O(n log n)
        Average Case : O(n log n)
        Worst Case   : O(n log n)
        """);
    }
}
