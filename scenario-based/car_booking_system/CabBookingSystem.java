package car_booking_system;

import java.util.Random;
import java.util.Scanner;

public class CabBookingSystem {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            RideService rideService = new RideService();

            // Pre-load drivers
            rideService.addDriver(new Driver(101, "Amit"));
            rideService.addDriver(new Driver(102, "Rohit"));

            System.out.print("Enter User ID: ");
            int userId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter User Name: ");
            String name = sc.nextLine();

            User user = new User(userId, name);

            System.out.print("Enter distance (km): ");
            double distance = sc.nextDouble();

            Random random = new Random();
            boolean isPeakHour = random.nextBoolean(); // true = Peak, false = Normal

            FareCalculator calculator;
            if (isPeakHour) {
                System.out.println("High demand detected. Peak pricing applied.");
                calculator = new PeakFareCalculator();
            } else {
                System.out.println("Normal demand. Standard pricing applied.");
                calculator = new NormalFareCalculator();
            }

            try {
                Ride ride = rideService.bookRide(user, distance, calculator);
                System.out.println("Ride Booked Successfully");
                System.out.println("Total Fare: ₹" + ride.getFare());
            } catch (NoDriverAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
