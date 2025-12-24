/*
Program:
Check whether three points A(x1,y1), B(x2,y2), and C(x3,y3)
are collinear using:
1. Slope formula
2. Area of triangle formula
*/

import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        // Avoid dividing by zero, used cross multiplication
        return (y2 - y1) * (x3 - x2) ==
               (y3 - y2) * (x2 - x1)
            &&
               (y3 - y1) * (x2 - x1) ==
               (y2 - y1) * (x3 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        double area = 0.5 * (
                x1 * (y2 - y3)
              + x2 * (y3 - y1)
              + x3 * (y1 - y2)
        );

        return area == 0;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1 y1: ");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            
            System.out.print("Enter x2 y2: ");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            System.out.print("Enter x3 y3: ");
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            
            boolean slopeResult =
                    isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
            
            boolean areaResult =
                    isCollinearUsingArea(x1, y1, x2, y2, x3, y3);
            
            System.out.println("\nUsing Slope Formula:");
            if (slopeResult) {
                System.out.println("Points are Collinear");
            } else {
                System.out.println("Points are NOT Collinear");
            }
            
            System.out.println("\nUsing Area of Triangle Formula:");
            if (areaResult) {
                System.out.println("Points are Collinear");
            } else {
                System.out.println("Points are NOT Collinear");
            }
        }
    }
}
