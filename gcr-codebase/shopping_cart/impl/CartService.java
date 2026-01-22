package shopping_cart.impl;

import java.util.*;

public class CartService {

    // Fast lookup: Product -> Price
    private final Map<String, Double> priceMap = new HashMap<>();

    // Maintain insertion order of cart items
    private final Map<String, Integer> cart = new LinkedHashMap<>();

    public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (!priceMap.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void removeFromCart(String product) {
        cart.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += priceMap.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    public void printCartInInsertionOrder() {
        System.out.println("Cart (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() +
                    " x" + entry.getValue() +
                    " = ₹" + priceMap.get(entry.getKey()) * entry.getValue());
        }
    }

    public void printCartSortedByPrice() {
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

        for (String product : cart.keySet()) {
            double price = priceMap.get(product);
            sortedByPrice
                    .computeIfAbsent(price, k -> new ArrayList<>())
                    .add(product);
        }

        System.out.println("Cart (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product +
                        " x" + cart.get(product) +
                        " @ ₹" + entry.getKey());
            }
        }
    }
}
