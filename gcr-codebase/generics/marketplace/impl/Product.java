package generics.marketplace.impl;

public class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    public String toString() {
        return name + " (" + category.getName() + ") : ₹" + price;
    }
}
