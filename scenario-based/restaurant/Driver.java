package restaurant;

import restaurant.impl.*;
import restaurant.exception.TableAlreadyReservedException;

public class Driver {
    public static void main(String[] args) {

        RestaurantService service = new RestaurantService();

        service.addTable(new Table(1, 4));
        service.addTable(new Table(2, 2));

        try {
            service.reserveTable(1, "7PM");
            service.reserveTable(1, "7PM"); // will fail
        } catch (TableAlreadyReservedException e) {
            System.out.println("[Exception Caught] " + e);
        }

        service.showAvailableTables("7PM");
        service.cancelReservation(1, "7PM");
        service.showAvailableTables("7PM");
    }
}
