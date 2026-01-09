package vehiclerental;

import java.util.Scanner;
import vehiclerental.impl.*;

public class RentalDriver {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            Customer customer = new Customer(name);
            
            System.out.println("1. Bike");
            System.out.println("2. Car");
            System.out.println("3. Truck");
            System.out.print("Choose Vehicle Type: ");
            int choice = sc.nextInt();
            
            sc.nextLine();
            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();
            
            System.out.print("Enter Rental Days: ");
            int days = sc.nextInt();
            
            Vehicle vehicle;
            
            switch (choice) {
                case 1 -> vehicle = new Bike(number);
                case 2 -> vehicle = new Car(number);
                case 3 -> vehicle = new Truck(number);
                default -> {
                    System.out.println("Invalid Choice");
                    sc.close();
                    return;
                }
            }
            
            customer.rentVehicle(vehicle, days);
        }
    }
}
