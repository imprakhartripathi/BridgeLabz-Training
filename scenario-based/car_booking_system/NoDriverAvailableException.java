package car_booking_system;

public class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String msg) {
        super(msg);
    }
}
