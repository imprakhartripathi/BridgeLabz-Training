import java.util.List;

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

abstract class Vehicle {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private String vehicleNumber;
    @SuppressWarnings("FieldMayBeFinal")
    private double rentalRate;

    protected Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    protected double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance";
    }
}

class Bike extends Vehicle {
    public Bike(String number, double rate) {
        super(number, rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("CAR123", 2000),
                new Bike("BIKE456", 800),
                new Truck("TRUCK789", 5000));

        for (Vehicle v : vehicles) {
            System.out.println("Rental Cost: " + v.calculateRentalCost(3));
            if (v instanceof Insurable i) {
                System.out.println("Insurance: " + i.calculateInsurance());
            }
        }
    }
}
