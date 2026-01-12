package hotel.impl;

public abstract class Room {
    protected int roomNumber;
    protected boolean available = true;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() throws RoomNotAvailableException {
        if (!available)
            throw new RoomNotAvailableException("Room not available");
        available = false;
    }

    public abstract double basePrice();
}
