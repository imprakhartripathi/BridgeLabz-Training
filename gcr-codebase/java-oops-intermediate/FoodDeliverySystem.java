interface Discountable {
    double applyDiscount();

    String getDiscountDetails();
}

abstract class FoodItem {
    @SuppressWarnings("FieldMayBeFinal")
    private String itemName;
    @SuppressWarnings("FieldMayBeFinal")
    private double price;
    @SuppressWarnings("FieldMayBeFinal")
    private int quantity;

    protected FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    protected double getPrice() {
        return price * quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity);
    }
}

@SuppressWarnings("unused")
class VegItem extends FoodItem {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() + 50;
    }

    @Override
    public double applyDiscount() {
        return 30;
    }

    @Override
    public String getDiscountDetails() {
        return "Flat ₹30 off";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item = new NonVegItem("Chicken Burger", 200, 2);
        System.out.println(item.calculateTotalPrice());
    }
}
