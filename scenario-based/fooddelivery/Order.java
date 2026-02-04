package fooddelivery;

public class Order {
    private final String orderId;
    private final int location; // simple distance metric

    public Order(String orderId, int location) {
        this.orderId = orderId;
        this.location = location;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getLocation() {
        return location;
    }
}
