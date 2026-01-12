package inventory.impl;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products = new HashMap<>();

    public void addProduct(Product p) {
        products.put(p.getName(), p);
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
}
