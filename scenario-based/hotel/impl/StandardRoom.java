package hotel.impl;

public class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber);
    }

    public double basePrice() {
        return 2000;
    }
}
