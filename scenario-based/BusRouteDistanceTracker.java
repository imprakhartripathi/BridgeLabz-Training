import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int totalDistance = 0;
            boolean passengerOnBus = true;
            
            System.out.println("Bus journey started");
            
            while (passengerOnBus) {
                
                System.out.print("Enter distance covered at this stop: ");
                int distance = sc.nextInt();
                
                if (distance < 0) {
                    System.out.println("Invalid distance input");
                    continue;
                }
                
                totalDistance = totalDistance + distance;
                
                System.out.println("Total distance so far is " + totalDistance);
                
                System.out.print("Do you want to get off the bus yes or no: ");
                String choice = sc.next();
                
                if (choice.equalsIgnoreCase("yes")) {
                    passengerOnBus = false;
                }
            }
            
            System.out.println("Passenger got off");
            System.out.println("Final distance travelled is " + totalDistance);
        }
    }
}
