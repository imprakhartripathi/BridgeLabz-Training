package evcharging.pricing;

public class PeakHourPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double units) {
        return units * 8; // ₹8 per unit
    }
}