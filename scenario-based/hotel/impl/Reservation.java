package hotel.impl;

public class Reservation {
    public Reservation(Room room, Guest guest, PricingStrategy pricing)
            throws RoomNotAvailableException {
        room.book();
        System.out.println("Booked at ₹" + pricing.calculate(room));
    }
}
