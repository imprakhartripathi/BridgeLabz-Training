package cinematime;

import cinematime.impl.CinemaManager;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CinemaManager manager = new CinemaManager();

        // Demo data
        manager.addMovie("Interstellar", "18:30");
        manager.addMovie("Inception", "21:15");
        manager.addMovie("The Dark Knight", "20:00");

        while (true) {
            System.out.println("\n1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Display All Movies");
            System.out.println("4. Print Report");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter movie title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter showtime (HH:MM): ");
                        String time = sc.nextLine();

                        manager.addMovie(title, time);
                        break;

                    case 2:
                        System.out.print("Enter keyword: ");
                        String keyword = sc.nextLine();
                        manager.searchMovie(keyword);
                        break;

                    case 3:
                        manager.displayAllMovies();
                        break;

                    case 4:
                        manager.printReport();
                        break;

                    case 5:
                        return;

                    default:
                        System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
