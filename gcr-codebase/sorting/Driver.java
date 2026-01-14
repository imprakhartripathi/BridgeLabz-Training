package sorting;

import sorting.impl.*;
import java.util.*;

public class Driver {

    public static int[] takeInput(Scanner sc, int n) {
        System.out.println();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] result = null;

            System.out.println("\nChoose Sorting Algorithm:");
            System.out.println("1. Bubble Sort - Sort Student Marks");
            System.out.println("2. Insertion Sort - Sort Employee IDs");
            System.out.println("3. Merge Sort - Sort an Array of Book Prices");
            System.out.println("4. Quick Sort - Sort Product Prices");
            System.out.println("5. Selection Sort - Sort Exam Scores");
            System.out.println("6. Heap Sort - Sort Job Applicants by Salary");
            System.out.println("7. Counting Sort - Sort Student Ages");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Exiting...");
                sc.close();
                return;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number of Students: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Students' Marks: ");
                    result = takeInput(sc, n);
                    BubbleSort.sort(result);
                }
                case 2 -> {
                    System.out.print("Enter number of Employees: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Employees' IDs: ");
                    result = takeInput(sc, n);
                    InsertionSort.sort(result);
                }
                case 3 -> {
                    System.out.print("Enter number of Books: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Book Prices: ");
                    result = takeInput(sc, n);
                    MergeSort.sort(result);
                }
                case 4 -> {
                    System.out.print("Enter number of Products: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Product Prices: ");
                    result = takeInput(sc, n);
                    QuickSort.sort(result);
                }
                case 5 -> {
                    System.out.print("Enter number of Students: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Students' Exam Scores: ");
                    result = takeInput(sc, n);
                    SelectionSort.sort(result);
                }
                case 6 -> {
                    System.out.print("Enter number of Applicants: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Applicants' Salary: ");
                    result = takeInput(sc, n);
                    HeapSort.sort(result);
                }
                case 7 -> {
                    System.out.print("Enter number of Students: ");
                    int n = sc.nextInt();
                    System.out.print("Enter Students' Ages: ");
                    result = takeInput(sc, n);
                    CountingSort.sort(result);
                }
                default -> {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }

            System.out.println("\nResult:");
            System.out.println(Arrays.toString(result));
        }
    }
}
