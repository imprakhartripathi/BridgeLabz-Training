// Movie Ticket Booking App
// Ask users for movie type, seat type (gold/silver), and snacks.
// Use switch and if together.
// Loop through multiple customers.
// Clean structure and helpful variable names.

import java.util.Scanner;

public class MovieBooking {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of customers");
            int customers = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= customers; i++) {
                System.out.println("Customer " + i);

                System.out.println("Enter movie type (action comedy drama)");
                String movieType = sc.nextLine();

                System.out.println("Enter seat type (gold or silver)");
                String seatType = sc.nextLine();

                System.out.println("Do you want snacks (yes or no)");
                String snacks = sc.nextLine();

                int price = 0;

                switch (movieType) {
                    case "action" -> price = 200;
                    case "comedy" -> price = 150;
                    case "drama" -> price = 180;
                    default -> System.out.println("Invalid movie type");
                }

                if (seatType.equals("gold")) {
                    price += 100;
                } else if (seatType.equals("silver")) {
                    price += 50;
                }

                if (snacks.equals("yes")) {
                    price += 80;
                }

                System.out.println("Total ticket price " + price);
                System.out.println();
            }
        }
    }
}
