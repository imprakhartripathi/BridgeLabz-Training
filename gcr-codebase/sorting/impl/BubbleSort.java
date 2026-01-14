package sorting.impl;

public class BubbleSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        printComplexity();
    }

    private static void printComplexity() {
        System.out.println("""
        Time Complexity:
        Best Case    : O(n)
        Average Case : O(n^2)
        Worst Case   : O(n^2)
        """);
    }
}
