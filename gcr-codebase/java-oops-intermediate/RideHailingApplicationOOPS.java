@SuppressWarnings("unused")
interface GPSOOPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

abstract class VehicleOOPS {
    @SuppressWarnings("FieldMayBeFinal")
    private String vehicleId;
    @SuppressWarnings("FieldMayBeFinal")
    private String driverName;
    @SuppressWarnings("FieldMayBeFinal")
    private double ratePerKm;

    protected VehicleOOPS(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(driverName + " driving " + vehicleId);
    }
}

class CarOOPS extends VehicleOOPS {
    public CarOOPS(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

@SuppressWarnings("unused")
class BikeOOPS extends VehicleOOPS {
    public BikeOOPS(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }
}

@SuppressWarnings("unused")
class AutoOOPS extends VehicleOOPS {
    public AutoOOPS(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }
}

public class RideHailingApplicationOOPS {
    public static void main(String[] args) {
        VehicleOOPS ride = new CarOOPS("CAR99", "Amit", 15);
        System.out.println(ride.calculateFare(10));
    }
}
