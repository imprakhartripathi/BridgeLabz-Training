package car_booking_system;

public class Driver {
    private final int driverId;
    private final String name;
    private boolean available = true;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
