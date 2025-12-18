
import java.util.Scanner;

// Write a DoubleOperation program by taking a, b, and c as input values and print the following double operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, and c of double data type.
// Take user input for a, b, and c.
// Compute 3 double operations and assign the result to a variable
// Finally, print the result and try to understand operator precedence.
// I/P => a, b, c
// O/P => The results of Double Operations are ___, ___, and ___

public class DoubleOperation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first double (a): ");
            double a = sc.nextDouble();
            System.out.print("Enter second double (b): ");
            double b = sc.nextDouble();
            System.out.print("Enter third double (c): ");
            double c = sc.nextDouble();

            double result1 = a + b * c;
            double result2 = a * b + c;
            double result3 = c + a / b;
            double result4 = a % b + c;

            System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3
                    + ", and " + result4);
        }
    }
}
