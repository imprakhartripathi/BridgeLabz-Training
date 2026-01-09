package vehiclerental.impl;

public class Bike extends Vehicle {
    public Bike(String number) {
        super(number, 500);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
