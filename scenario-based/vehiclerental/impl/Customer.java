package vehiclerental.impl;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle v, int days) {
        System.out.println(name + " Rent Amount: " + v.calculateRent(days));
    }
}
