package hotel.impl;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber);
    }

    public double basePrice() {
        return 4000;
    }
}
