package generics.warehouse;

import generics.warehouse.impl.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Storage<WarehouseItem> storage = new Storage<>();

        storage.addItem(new Electronics("Laptop", 70000));
        storage.addItem(new Groceries("Wheat", 1200));

        while (true) {
            System.out.println("1.Add 2.View 3.Exit");
            int c = sc.nextInt(); sc.nextLine();

            if (c == 1) {
                System.out.print("Type: ");
                String type = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();

                if (type.equalsIgnoreCase("electronics"))
                    storage.addItem(new Electronics(name, price));
                else if (type.equalsIgnoreCase("groceries"))
                    storage.addItem(new Groceries(name, price));
            } else if (c == 2) {
                Storage.displayAll(storage.getItems());
            } else break;
        }
    }
}
