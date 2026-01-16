package searching.impl;

public class BinarySearchFirstLastOccurrence {
    public static int[] find(int[] arr, int target) {
        return new int[]{first(arr, target), last(arr, target)};
    }

    private static int first(int[] a, int t) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) { res = m; r = m - 1; }
            else if (a[m] < t) l = m + 1;
            else r = m - 1;
        }
        return res;
    }

    private static int last(int[] a, int t) {
        int l = 0, r = a.length - 1, res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == t) { res = m; l = m + 1; }
            else if (a[m] < t) l = m + 1;
            else r = m - 1;
        }
        return res;
    }
}
