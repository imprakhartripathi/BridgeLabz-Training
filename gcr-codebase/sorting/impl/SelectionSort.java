package sorting.impl;

public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        printComplexity();
    }

    private static void printComplexity() {
        System.out.println("""
        Time Complexity:
        Best Case    : O(n^2)
        Average Case : O(n^2)
        Worst Case   : O(n^2)
        """);
    }
}
