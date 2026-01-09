package vehiclerental.impl;

public class Car extends Vehicle {
    public Car(String number) {
        super(number, 1200);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
}
