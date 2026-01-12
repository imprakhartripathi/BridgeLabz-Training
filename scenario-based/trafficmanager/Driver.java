package trafficmanager;

import trafficmanager.impl.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrafficManager manager = new TrafficManager(5);

        while (true) {
            System.out.println("\n1. Vehicle Arrives");
            System.out.println("2. Vehicle Exits");
            System.out.println("3. Print Roundabout");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    manager.vehicleArrives(sc.next());
                    break;
                case 2:
                    manager.vehicleExits();
                    break;
                case 3:
                    manager.printState();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
