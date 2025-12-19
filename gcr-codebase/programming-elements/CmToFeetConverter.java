import java.util.Scanner;

public class CmToFeetConverter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your height in centimeters: ");
            double heightCm = sc.nextDouble();
            // Convert cm to inches: 1 inch = 2.54 cm
            double totalInches = heightCm / 2.54;
            // Convert inches to feet: 1 foot = 12 inches
            int feet = (int) (totalInches / 12);
            double inches = totalInches % 12;

            System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        }
    }
}
