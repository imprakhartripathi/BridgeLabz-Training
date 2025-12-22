// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
// Hint => 
    // Create a method to define the random 2-digit age of several students provided as method parameters and return a 1D array of ages of n students
// Create a method that takes an array of age as a parameter and returns a 2D String array of age and a boolean true or false to indicate can and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to set true to indicate can vote.
// Create a method to display the 2D array in a tabular format.
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }
        String[][] result = checkEligibility(ages);
        displayResult(result);
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(99) + 1;
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Can vote";
            } else {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Cannot vote";
            }
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println();
        System.out.println("Age\t\tEligibility");
        System.out.println("---------------------------");
        for (String[] data1 : data) {
            System.out.println(data1[0] + "\t\t" + data1[1]);
        }
    }
}