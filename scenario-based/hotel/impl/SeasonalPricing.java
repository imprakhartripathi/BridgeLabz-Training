package hotel.impl;

public class SeasonalPricing implements PricingStrategy {
    public double calculate(Room room) {
        return room.basePrice() * 1.2;
    }
}
