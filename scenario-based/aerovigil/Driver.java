package aerovigil;

import aerovigil.impl.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightUtil util = new FlightUtil();

        System.out.println("Enter flight details in the format:");
        System.out.println("FL-XXXX:FlightName:PassengerCount:CurrentFuelLevel");
        System.out.println("Example: FL-1234:SpiceJet:250:50000");
        System.out.print(">> ");

        try {
            String input = sc.nextLine().trim();
            String[] parts = input.split(":");

            if (parts.length != 4) {
                System.out.println("Invalid input format. Please provide exactly 4 values separated by ':'");
                return;
            }

            String flightNumber = parts[0];
            String flightName = parts[1];
            int passengerCount = Integer.parseInt(parts[2]);
            double currentFuel = Double.parseDouble(parts[3]);

            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validatePassengerCount(passengerCount, flightName);

            double fuelRequired =
                    util.calculateFuelToFillTank(flightName, currentFuel);

            System.out.println("Fuel required to fill the tank: "
                    + fuelRequired + " liters");

        } catch (NumberFormatException e) {
            System.out.println("Passenger count and fuel level must be numeric values.");
        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
    }
}
