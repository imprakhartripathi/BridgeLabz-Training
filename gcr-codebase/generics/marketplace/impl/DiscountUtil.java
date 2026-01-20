package generics.marketplace.impl;

public class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T p, double percent) {
        double newPrice = p.getPrice() * (1 - percent / 100);
        p.setPrice(newPrice);
    }
}
