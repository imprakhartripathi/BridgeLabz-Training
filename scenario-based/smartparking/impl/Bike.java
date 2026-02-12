package smartparking.impl;

public class Bike extends Vehicle {

    public Bike(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
