package sorting.impl;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
