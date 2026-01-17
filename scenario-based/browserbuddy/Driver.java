package browserbuddy;

import browserbuddy.impl.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            TabManager manager = new TabManager();
            
            boolean running = true;

            System.out.println("\n=== BrowserBuddy Menu ===");
            System.out.println("1. Open New Tab");
            System.out.println("2. Visit Page");
            System.out.println("3. Back");
            System.out.println("4. Forward");
            System.out.println("5. Show Current Page");
            System.out.println("6. Close Current Tab");
            System.out.println("7. Restore Last Closed Tab");
            System.out.println("8. Exit");
            
            while (running) {
                System.out.print("Choose option: ");
                
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline
                
                try {
                    switch (choice) {
                        
                        case 1 -> manager.openNewTab();
                            
                        case 2 -> {
                            System.out.print("Enter URL: ");
                            String url = sc.nextLine();
                            manager.getActiveTab().visit(url);
                        }
                            
                        case 3 -> manager.getActiveTab().back();
                            
                        case 4 -> manager.getActiveTab().forward();
                            
                        case 5 -> System.out.println("Current page: " + manager.getActiveTab().getCurrentPage());
                            
                        case 6 -> manager.closeCurrentTab();
                            
                        case 7 -> manager.restoreLastClosedTab();
                            
                        case 8 -> {
                            running = false;
                            System.out.println("Exiting BrowserBuddy...");
                        }
                            
                        default -> System.out.println("Invalid option");
                    }
                    
                }    catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
