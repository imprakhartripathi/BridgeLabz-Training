package car_booking_system;

public class PeakFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(double distance) {
        return distance * 15;
    }
}
