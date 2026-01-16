package searching.impl;

public class BinarySearchRotationPoint {
    public static int find(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] > arr[r]) l = m + 1;
            else r = m;
        }
        return l;
    }
}
