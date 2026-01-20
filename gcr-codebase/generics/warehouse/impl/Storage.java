package generics.warehouse.impl;

import java.util.*;

public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }

    public static void displayAll(List<? extends WarehouseItem> list) {
        for (WarehouseItem i : list) System.out.println(i);
    }
}
