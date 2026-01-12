package inventory.impl;

public class ConsoleAlertService implements AlertService {
    public void alertLowStock(Product product) {
        if (product.getQuantity() < 5)
            System.out.println("⚠ Low Stock Alert for " + product.getName());
    }
}
