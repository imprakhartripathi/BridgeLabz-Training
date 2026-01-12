package hotel;

import hotel.impl.*;

public class Driver {
    public static void main(String[] args) {
        Room room = new DeluxeRoom(101);
        Guest guest = new Guest("Ankit");
        PricingStrategy pricing = new SeasonalPricing();

        try {
            new Reservation(room, guest, pricing);
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
