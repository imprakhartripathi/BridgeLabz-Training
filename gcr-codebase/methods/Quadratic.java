/*
Program:
Find the roots of a Quadratic Equation of the form:
ax^2 + bx + c = 0

Logic:
delta = b^2 - 4ac

- If delta > 0 → two real roots
- If delta == 0 → one real root
- If delta < 0 → no real roots (return empty array)
*/

import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};

        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};

        } else {
            return new double[]{}; // No real roots
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two real roots:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);

        } else if (roots.length == 1) {
            System.out.println("One real root:");
            System.out.println("Root = " + roots[0]);

        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}
