public class ProductDemo {

    private static double discount = 10.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public ProductDemo(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProduct() {
        if (this instanceof ProductDemo) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double finalPrice = price - (price * discount / 100);
            System.out.println("Price after Discount: $" + finalPrice);
        }
    }

    public static void main(String[] args) {
        ProductDemo p1 = new ProductDemo("P001", "Laptop", 1200, 5);
        ProductDemo p2 = new ProductDemo("P002", "Smartphone", 800, 10);

        p1.displayProduct();
        System.out.println();
        p2.displayProduct();
    }
}
