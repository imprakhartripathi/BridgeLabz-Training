/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint =>
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/

import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter Principal: ");
            double principal = sc.nextDouble();
            
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();
            
            System.out.print("Enter Time: ");
            double time = sc.nextDouble();
            
            // Calculating simple interest
            double simpleInterest = calculateSimpleInterest(principal, rate, time);
            
            // Output
            System.out.println(
                    "The Simple Interest is " + simpleInterest +
                            " for Principal " + principal +
                            ", Rate of Interest " + rate +
                            " and Time " + time
            );
        }
    }
}
