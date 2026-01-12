package ecommerce.impl;

public class Order {
    private Product product;
    private boolean isCancelled;

    public Order(Product product) {
        this.product = product;
        this.isCancelled = false;
    }

    public double getAmount() {
        return product.getPrice();
    }

    public void cancel() {
        isCancelled = true;
    }

    public boolean isCancelled() {
        return isCancelled;
    }
}
