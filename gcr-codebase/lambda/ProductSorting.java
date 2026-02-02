package lambda;

import java.util.*;

public class ProductSorting {

    static class Product {
        String name;
        int price;
        double rating;

        Product(String name, int price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Phone", 50000, 4.5),
                new Product("Laptop", 90000, 4.7),
                new Product("Headphones", 3000, 4.2)
        );

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Product Sorting Engine ===");
        System.out.println("Sort products by:");
        System.out.println("1. Price (Low to High)");
        System.out.println("2. Rating (High to Low)");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();

        Comparator<Product> comparator = switch (choice) {
            case 1 -> (a, b) -> a.price - b.price;
            case 2 -> (a, b) -> Double.compare(b.rating, a.rating);
            default -> null;
        };

        if (comparator == null) {
            System.out.println("Invalid option selected.");
            return;
        }

        products.stream()
                .sorted(comparator)
                .forEach(p ->
                        System.out.println(p.name +
                                " | ₹" + p.price +
                                " | Rating: " + p.rating)
                );
    }
}
