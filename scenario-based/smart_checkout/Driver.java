package smart_checkout;

import smart_checkout.impl.*;

public class Driver {
    public static void main(String[] args) {

        SmartCheckoutService checkout = new SmartCheckoutService();

        // Setup inventory
        checkout.addItemToInventory("Milk", 35, 10);
        checkout.addItemToInventory("Bread", 40, 5);
        checkout.addItemToInventory("Butter", 50, 30);
        checkout.addItemToInventory("Biscuits", 10, 60);

        // Customer 1
        Customer ram = new Customer("Ram");
        ram.addItem("Milk", 2);
        ram.addItem("Biscuits", 5);

        // Customer 2
        Customer prakash = new Customer("Prakash");
        prakash.addItem("Bread", 1);
        prakash.addItem("Butter", 1);

        checkout.addCustomer(ram);
        checkout.addCustomer(prakash);

        checkout.processNextCustomer();
        checkout.processNextCustomer();

        checkout.printRemainingStock();
    }
}
