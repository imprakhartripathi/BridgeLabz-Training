package smartparking.impl;

public class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public String getType() {
        return "Car";
    }
}
