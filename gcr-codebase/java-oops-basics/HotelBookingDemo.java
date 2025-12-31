import java.util.Scanner;

public class HotelBookingDemo {
    String guestName;
    String roomType;
    int nights;

    HotelBookingDemo() {
        this("Guest", "Standard", 1);
    }

    HotelBookingDemo(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    HotelBookingDemo(HotelBookingDemo h) {
        this(h.guestName, h.roomType, h.nights);
    }

    void display() {
        System.out.println("Guest Name: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBookingDemo booking;

        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Enter guest name: ");
                String name = sc.nextLine();

                System.out.print("Enter room type: ");
                String room = sc.nextLine();

                System.out.print("Enter nights: ");
                int nights = sc.nextInt();

                booking = new HotelBookingDemo(name, room, nights);
            } catch (Exception e) {
                System.out.println("Invalid input. Using default booking.");
                booking = new HotelBookingDemo();
            }

            HotelBookingDemo copy = new HotelBookingDemo(booking);
            copy.display();
        }
    }
}
