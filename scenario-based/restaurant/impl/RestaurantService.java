package restaurant.impl;

import restaurant.exception.TableAlreadyReservedException;

import java.util.*;

public class RestaurantService {

    private Map<Integer, Table> tables = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addTable(Table table) {
        tables.put(table.getTableNumber(), table);
    }

    public void reserveTable(int tableNumber, String timeSlot)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber &&
                    r.getTimeSlot().equals(timeSlot)) {
                throw new TableAlreadyReservedException(tableNumber, timeSlot);
            }
        }
        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("Reservation successful.");
    }

    public void cancelReservation(int tableNumber, String timeSlot) {
        reservations.removeIf(r ->
                r.getTableNumber() == tableNumber &&
                        r.getTimeSlot().equals(timeSlot));
        System.out.println("Reservation cancelled.");
    }

    public void showAvailableTables(String timeSlot) {
        Set<Integer> reservedTables = new HashSet<>();

        for (Reservation r : reservations) {
            if (r.getTimeSlot().equals(timeSlot)) {
                reservedTables.add(r.getTableNumber());
            }
        }

        System.out.println("Available tables at " + timeSlot + ":");
        for (Table t : tables.values()) {
            if (!reservedTables.contains(t.getTableNumber())) {
                System.out.println("Table " + t.getTableNumber());
            }
        }
    }
}
