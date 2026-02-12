package smartparking;

import smartparking.impl.*;

public class Driver {
    public static void main(String[] args) {

        ParkingService service = new ParkingService();

        // Add parking slots
        service.addSlot(new ParkingSlot(1));
        service.addSlot(new ParkingSlot(2));
        service.addSlot(new ParkingSlot(3));

        // Add vehicles
        service.addVehicle(new Car("UP85AB1234"));
        service.addVehicle(new Bike("UP78XY5678"));
        service.addVehicle(new Car("UP32CD9999"));
        service.addVehicle(new Bike("UP16MN0001"));

        service.processParking();
    }
}
