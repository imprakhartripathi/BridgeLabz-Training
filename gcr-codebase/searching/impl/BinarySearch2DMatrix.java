package searching.impl;

public class BinarySearch2DMatrix {
    public static boolean search(int[][] m, int target) {
        int r = m.length, c = m[0].length;
        int l = 0, h = r * c - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            int val = m[mid / c][mid % c];
            if (val == target) return true;
            if (val < target) l = mid + 1;
            else h = mid - 1;
        }
        return false;
    }
}
