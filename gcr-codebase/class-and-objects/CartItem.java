public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    void removeItem(int qty) {
        quantity -= qty;
        System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
    }

    void displayTotal() {
        System.out.println("Total cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.itemName = "Laptop";
        c.price = 999.99;
        c.quantity = 1;

        System.out.println("Item: " + c.itemName + ", Price: $" + c.price + ", Quantity: " + c.quantity);
        c.addItem(2);
        c.removeItem(1);
        c.displayTotal();
    }
}

