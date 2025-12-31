public class Product {
    private String productName;
    private double price;

    private static int totalProducts = 0;

    public Product(String productName, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Book", 50);

        p1.displayProductDetails();
        p2.displayProductDetails();

        displayTotalProducts();
    }
}
