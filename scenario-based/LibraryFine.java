// Rohan’s Library Reminder App
// Rohan wants a fine calculator:
// Input return date and due date.
// If returned late, calculate fine: Rs. 5/day.
// Repeat for 5 books using for-loop.

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Book " + i);

                System.out.println("Enter due date (day number)");
                int dueDate = sc.nextInt();

                System.out.println("Enter return date (day number)");
                int returnDate = sc.nextInt();

                if (returnDate > dueDate) {
                    int lateDays = returnDate - dueDate;
                    int fine = lateDays * 5;
                    System.out.println("Late by " + lateDays + " days");
                    System.out.println("Fine amount Rs. " + fine);
                } else {
                    System.out.println("No fine");
                }

                System.out.println();
            }
        }
    }
}
