package car_booking_system;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    private final List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public Ride bookRide(User user, double distance, FareCalculator calculator)
            throws NoDriverAvailableException {

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                driver.setAvailable(false);
                double fare = calculator.calculateFare(distance);
                return new Ride(fare);
            }
        }
        throw new NoDriverAvailableException("No driver available currently");
    }
}
