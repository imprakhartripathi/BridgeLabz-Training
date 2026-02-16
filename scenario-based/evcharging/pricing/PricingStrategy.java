package evcharging.pricing;

public interface PricingStrategy {
    double calculatePrice(double units);
}