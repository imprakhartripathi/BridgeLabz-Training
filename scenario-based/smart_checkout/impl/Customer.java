package smart_checkout.impl;

import java.util.*;

public class Customer {

    private final String name;
    private final Map<String, Integer> items; // ItemName -> Quantity

    public Customer(String name) {
        this.name = name;
        this.items = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, items.getOrDefault(itemName, 0) + quantity);
    }
}
