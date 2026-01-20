package generics.warehouse.impl;
public class Groceries extends WarehouseItem {
    public Groceries(String n, double p) { super(n, p); }
    public String getType() { return "Groceries"; }
}
