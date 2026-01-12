package inventory;

import inventory.impl.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        AlertService alertService = new ConsoleAlertService();

        inventory.addProduct(new Product("Mouse", 10));

        System.out.print("Enter quantity to sell: ");
        int qty = sc.nextInt();

        try {
            Product p = inventory.getProduct("Mouse");
            p.reduceStock(qty);
            alertService.alertLowStock(p);
            System.out.println("Remaining stock: " + p.getQuantity());
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}
