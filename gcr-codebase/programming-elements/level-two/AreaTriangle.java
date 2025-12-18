
import java.util.Scanner;

// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___

public class AreaTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base in cm: ");
            double baseCm = sc.nextDouble();
            System.out.print("Enter height in cm: ");
            double heightCm = sc.nextDouble();

            double areaSqCm = 0.5 * baseCm * heightCm;
            double areaSqIn = areaSqCm / (2.54 * 2.54);

            System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
        }
    }
}
