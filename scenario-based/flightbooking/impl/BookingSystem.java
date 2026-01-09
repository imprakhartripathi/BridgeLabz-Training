package flightbooking.impl;

import java.util.*;

public class BookingSystem {
    private Flight[] flights;
    private List<Flight> bookings = new ArrayList<>();

    public BookingSystem(Flight[] flights) {
        this.flights = flights;
    }

    public void searchFlight(String src, String dest) {
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                f.destination.equalsIgnoreCase(dest)) {
                System.out.println(f);
            }
        }
    }

    public void bookFlight(String flightNo) {
        for (Flight f : flights) {
            if (f.flightNo.equalsIgnoreCase(flightNo)) {
                bookings.add(f);
                System.out.println("Booked: " + f);
                return;
            }
        }
        System.out.println("Flight not found");
    }

    public void showBookings() {
        bookings.forEach(System.out::println);
    }
}
