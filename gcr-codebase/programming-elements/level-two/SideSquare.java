// Write a program to find the side of the square whose parameter you read from the user 
// Hint => Perimeter of the Square is 4 times the side
// I/P => perimeter
// O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;

public class SideSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter perimeter of the square: ");
            double perimeter = sc.nextDouble();
            double side = perimeter / 4;
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
    }
}
