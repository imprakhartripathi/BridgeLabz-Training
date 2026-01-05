import java.util.Scanner;

public class CafeteriaMenuApp {

    static class CafeteriaMenu {
        @SuppressWarnings("FieldMayBeFinal")
        private static String[] items = {
                "Sandwich", "Burger", "Pizza", "Pasta", "Salad",
                "Coffee", "Tea", "Juice", "Fries", "Dessert"
        };

        public static void displayMenu() {
            System.out.println("\n--- Cafeteria Menu ---");
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + " - " + items[i]);
            }
            System.out.println("10 - Exit");
        }

        public static String getItemByIndex(int index) {
            if (index < 0 || index >= items.length) {
                return "Invalid selection";
            }
            return items[index];
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            
            do {
                CafeteriaMenu.displayMenu();
                
                System.out.print("Select item index: ");
                choice = sc.nextInt();
                
                if (choice == 10) {
                    System.out.println("Exiting Cafeteria Menu. Thank you!");
                } else {
                    System.out.println("You selected: " +
                            CafeteriaMenu.getItemByIndex(choice));
                }
                
            } while (choice != 10);
        }
    }
}
