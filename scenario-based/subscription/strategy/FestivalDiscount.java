package subscription.strategy;

public class FestivalDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.8; // 20% off
    }
}