package searching.impl;

import java.util.Arrays;

public class ChallengeSearch {
    public static int firstMissingPositive(int[] arr) {
        boolean[] seen = new boolean[arr.length + 1];
        for (int n : arr)
            if (n > 0 && n <= arr.length) seen[n] = true;

        for (int i = 1; i < seen.length; i++)
            if (!seen[i]) return i;
        return arr.length + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == target) return m;
            if (arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
