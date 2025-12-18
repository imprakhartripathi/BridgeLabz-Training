
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = inp.nextInt();
            System.out.print("Enter second number: ");
            int b = inp.nextInt();
            System.out.print("Enter third number: ");
            int c = inp.nextInt();

            System.out.println("Greatest number is: " + greatestOfThree(a, b, c));
        }
    }

    private static int greatestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}