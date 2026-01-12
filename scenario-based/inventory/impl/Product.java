package inventory.impl;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void reduceStock(int qty) throws OutOfStockException {
        if (quantity < qty)
            throw new OutOfStockException("Stock insufficient");
        quantity -= qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
