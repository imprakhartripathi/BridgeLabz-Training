package searching;

import searching.impl.*;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== SEARCHING MENU =====");
            System.out.println("1. Linear Search – First Negative Number");
            System.out.println("2. Linear Search – Word in Sentence List");
            System.out.println("3. Binary Search – Rotation Point");
            System.out.println("4. Binary Search – Peak Element");
            System.out.println("5. Binary Search – Search in 2D Matrix");
            System.out.println("6. Binary Search – First & Last Occurrence");
            System.out.println("7. Challenge Problem");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> linearFirstNegative();
                case 2 -> linearWordSearch();
                case 3 -> binaryRotationPoint();
                case 4 -> binaryPeakElement();
                case 5 -> binary2DMatrix();
                case 6 -> binaryFirstLastOccurrence();
                case 7 -> challengeProblem();
                case 0 -> {
                    System.out.println("Exiting application.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    /* ---------------- LINEAR SEARCHES ---------------- */

    private static void linearFirstNegative() {
        int[] arr = readIntArray();
        int index = LinearSearchFirstNegative.find(arr);
        System.out.println("Result Index: " + index);
    }

    private static void linearWordSearch() {
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Sentence " + (i + 1) + ": ");
            sentences[i] = sc.nextLine();
        }

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        String result = LinearSearchWordInSentence.find(sentences, word);
        System.out.println("Result: " + result);
    }

    /* ---------------- BINARY SEARCHES ---------------- */

    private static void binaryRotationPoint() {
        int[] arr = readIntArray();
        int index = BinarySearchRotationPoint.find(arr);
        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);
    }

    private static void binaryPeakElement() {
        int[] arr = readIntArray();
        int peak = BinarySearchPeakElement.find(arr);
        System.out.println("Peak Element: " + peak);
    }

    private static void binary2DMatrix() {
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        boolean found = BinarySearch2DMatrix.search(matrix, target);
        System.out.println("Found: " + found);
    }

    private static void binaryFirstLastOccurrence() {
        int[] arr = readIntArray();
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int[] result = BinarySearchFirstLastOccurrence.find(arr, target);
        System.out.println("First Occurrence Index: " + result[0]);
        System.out.println("Last Occurrence Index: " + result[1]);
    }

    /* ---------------- CHALLENGE ---------------- */

    private static void challengeProblem() {
        int[] arr = readIntArray();

        int missing = ChallengeSearch.firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        System.out.print("Enter target for binary search: ");
        int target = sc.nextInt();

        int index = ChallengeSearch.binarySearch(arr, target);
        System.out.println("Target Index after Sorting: " + index);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    /* ---------------- UTIL ---------------- */

    private static int[] readIntArray() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
