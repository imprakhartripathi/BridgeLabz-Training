/*
Create a program to divide N number of chocolates among M children.
Print the number of chocolates each child will get and also the remaining chocolates
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)
*/

import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   // chocolates per child
        int remainder = number % divisor;  // remaining chocolates

        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter total number of chocolates: ");
            int numberOfChocolates = sc.nextInt();
            
            System.out.print("Enter number of children: ");
            int numberOfChildren = sc.nextInt();
            
            // Calculating distribution
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            
            // Displaying result
            System.out.println("Each child will get " + result[1] + " chocolates");
            System.out.println("Remaining chocolates: " + result[0]);
        }
    }
}
