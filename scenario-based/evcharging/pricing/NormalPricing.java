package evcharging.pricing;

public class NormalPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double units) {
        return units * 5; // ₹5 per unit
    }
}