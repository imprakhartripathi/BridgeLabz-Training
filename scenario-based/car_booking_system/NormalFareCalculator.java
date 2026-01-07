package car_booking_system;

public class NormalFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }
}
