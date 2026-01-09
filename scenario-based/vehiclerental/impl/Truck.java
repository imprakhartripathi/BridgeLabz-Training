package vehiclerental.impl;

public class Truck extends Vehicle {
    public Truck(String number) {
        super(number, 2500);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
