import java.util.List;

interface Taxable {
    double calculateTax();

    String getTaxDetails();
}

abstract class Product {
    @SuppressWarnings("unused")
    private final int productId;
    @SuppressWarnings("unused")
    private final String name;
    private double price;

    protected Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public abstract double calculateDiscount();
}

@SuppressWarnings("unused")
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST 18%";
    }
}

@SuppressWarnings("unused")
class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}

@SuppressWarnings("unused")
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println("Final Price: " + finalPrice);
        }
    }
}
