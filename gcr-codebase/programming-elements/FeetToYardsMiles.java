import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the distance in feet: ");
            double distanceInFeet = sc.nextDouble();
            
            // Convert feet to yards: 1 yard = 3 feet
            double distanceInYards = distanceInFeet / 3;
            // Convert yards to miles: 1 mile = 1760 yards
            double distanceInMiles = distanceInYards / 1760;
            
            System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
        }
    }    
}
