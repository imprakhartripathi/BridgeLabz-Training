
import java.util.Scanner;

// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, and c of int data type.
// Take user input for a, b, and c.
// Compute 3 integer operations and assign the result to a variable
// Finally, print the result and try to understand operator precedence.
// I/P => a, b, c
// O/P => The results of Int Operations are ___, ___, and ___

public class IntOperation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integer (a): ");
            int a = sc.nextInt();
            System.out.print("Enter second integer (b): ");
            int b = sc.nextInt();
            System.out.print("Enter third integer (c): ");
            int c = sc.nextInt();

            int result1 = a + b * c;
            int result2 = a * b + c;
            int result3 = c + a / b;
            int result4 = a % b + c;

            System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        }
    }
}
