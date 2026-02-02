package functional_interfaces;

interface Dashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery: N/A");
    }
}

class ElectricCar implements Dashboard {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
    public void displayBattery() {
        System.out.println("Battery: 75%");
    }
}

public class VehicleDashboardDemo {
    public static void main(String[] args) {
        Dashboard d = new ElectricCar();
        d.displaySpeed();
        d.displayBattery();
    }
}
