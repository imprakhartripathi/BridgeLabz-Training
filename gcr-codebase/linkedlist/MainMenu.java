package linkedlist;

import java.util.Scanner;
import linkedlist.impl.InventorySLL;
import linkedlist.impl.LibraryDLL;
import linkedlist.impl.MovieDLL;
import linkedlist.impl.RoundRobinCLL;
import linkedlist.impl.SocialMediaSLL;
import linkedlist.impl.StudentSLL;
import linkedlist.impl.TaskCLL;
import linkedlist.impl.TicketCLL;
import linkedlist.impl.UndoRedoDLL;

public class MainMenu {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n=== LINKED LIST APPLICATIONS ===");
                System.out.println("1. Student Records");
                System.out.println("2. Movie Management");
                System.out.println("3. Task Scheduler");
                System.out.println("4. Inventory System");
                System.out.println("5. Library System");
                System.out.println("6. Round Robin Scheduling");
                System.out.println("7. Social Media Friends");
                System.out.println("8. Undo / Redo Editor");
                System.out.println("9. Ticket Reservation");
                System.out.println("0. Exit");
                System.out.print("Choice: ");

                int ch = sc.nextInt();

                switch (ch) {
                    case 1 -> new StudentSLL().menu();
                    case 2 -> new MovieDLL().menu();
                    case 3 -> new TaskCLL().menu();
                    case 4 -> new InventorySLL().menu();
                    case 5 -> new LibraryDLL().menu();
                    case 6 -> new RoundRobinCLL().menu();
                    case 7 -> new SocialMediaSLL().menu();
                    case 8 -> new UndoRedoDLL().menu();
                    case 9 -> new TicketCLL().menu();
                    case 0 -> System.exit(0);
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
    }
}
