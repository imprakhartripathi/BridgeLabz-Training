import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter distance in kilometers:");
            double km = sc.nextDouble();
            // Convert km to miles: 1 km ≈ 0.621371 miles
            double miles = km * 0.621371;
            System.out.println("Miles = " + miles);
        }
    }
}
