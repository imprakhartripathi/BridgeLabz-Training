package flightbooking;

import flightbooking.impl.*;
import java.util.Scanner;

public class FlightBookingDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Preloading Flights: Simulating Real World
        Flight[] flights = {
            new Flight("AI101", "Delhi", "Mumbai"),
            new Flight("AI202", "Delhi", "Bangalore"),
            new Flight("AI303", "Mumbai", "Chennai")
        };

        BookingSystem system = new BookingSystem(flights);

        while (true) {
            System.out.println("\n1. Search Flight");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Source: ");
                    String src = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    system.searchFlight(src, dest);
                }
                case 2 -> {
                    System.out.print("Enter Flight Number: ");
                    String flightNo = sc.nextLine();
                    system.bookFlight(flightNo);
                }
                case 3 -> system.showBookings();
                case 4 -> {
                    System.out.println("Exiting System");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
