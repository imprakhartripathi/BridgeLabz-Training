/*
Program:
Find the youngest and tallest friend among Amar, Akbar, and Anthony.

Approach:
- Take user input for age and height of 3 friends
- Store ages and heights in two separate arrays
- Use a method to find the youngest friend
- Use a method to find the tallest friend
*/

import java.util.Scanner;

public class FriendsComparison {

    // Method to find youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    // Method to find tallest friend
    public static String findTallest(double[] heights, String[] names) {
        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            double[] heights = new double[3];
            
            // Taking input
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + names[i] + ": ");
                ages[i] = sc.nextInt();
                
                System.out.print("Enter height of " + names[i] + " (in cm): ");
                heights[i] = sc.nextDouble();
            }
            
            // Method calls
            String youngest = findYoungest(ages, names);
            String tallest = findTallest(heights, names);
            
            // Display results
            System.out.println("\nYoungest friend: " + youngest);
            System.out.println("Tallest friend: " + tallest);
        }
    }
}
