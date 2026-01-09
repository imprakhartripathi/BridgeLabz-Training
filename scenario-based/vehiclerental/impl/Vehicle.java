package vehiclerental.impl;

public abstract class Vehicle implements IRentable {
    protected String number;
    protected double ratePerDay;

    public Vehicle(String number, double ratePerDay) {
        this.number = number;
        this.ratePerDay = ratePerDay;
    }
}
