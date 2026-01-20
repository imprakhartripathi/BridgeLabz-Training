package generics.warehouse.impl;

public abstract class WarehouseItem {
    protected String name;
    protected double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getType();

    public String toString() {
        return getType() + " - " + name + " : ₹" + price;
    }
}
