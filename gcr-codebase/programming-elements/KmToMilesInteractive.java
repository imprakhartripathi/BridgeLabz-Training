import java.util.Scanner;

public class KmToMilesInteractive {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter distance in kilometers: ");
            double km = sc.nextDouble();
            // Convert km to miles: 1 km = ~0.625 miles (or 1 km / 1.6)
            double miles = km / 1.6;
            System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        }
    }
}
