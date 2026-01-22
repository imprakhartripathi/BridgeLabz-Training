package smart_checkout.impl;

import java.util.*;

public class SmartCheckoutService {

    // Queue of customers
    private final Queue<Customer> customerQueue = new ArrayDeque<>();

    // ItemName -> Item (price + stock)
    private final Map<String, Item> inventory = new HashMap<>();

    public void addItemToInventory(String name, double price, int stock) {
        inventory.put(name, new Item(name, price, stock));
    }

    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println("Customer added to queue: " + customer.getName());
    }

    public void processNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        System.out.println("\nProcessing customer: " + customer.getName());

        double totalBill = 0;

        for (Map.Entry<String, Integer> entry : customer.getItems().entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();

            Item item = inventory.get(itemName);

            if (item == null) {
                System.out.println("Item not found: " + itemName);
                continue;
            }

            if (item.getStock() < quantity) {
                System.out.println("Insufficient stock for " + itemName);
                continue;
            }

            item.reduceStock(quantity);
            double cost = item.getPrice() * quantity;
            totalBill += cost;

            System.out.println(itemName +
                    " x" + quantity +
                    " @ ₹" + item.getPrice() +
                    " each = ₹" + cost);
        }

        System.out.println("Total bill for " + customer.getName() + ": ₹" + totalBill);
    }

    public void printRemainingStock() {
        System.out.println("\nRemaining Inventory:");
        for (Item item : inventory.values()) {
            System.out.println(item.getName() +
                    " | Stock: " + item.getStock() +
                    " | Price: ₹" + item.getPrice());
        }
    }
}
