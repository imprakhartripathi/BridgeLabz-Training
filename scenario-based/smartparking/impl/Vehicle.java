package smartparking.impl;

public abstract class Vehicle {

    protected String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract String getType();
}
