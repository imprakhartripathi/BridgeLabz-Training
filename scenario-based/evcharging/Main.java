package evcharging;

import evcharging.exp.NoChargingSlotAvailableException;
import evcharging.model.ChargingSlot;
import evcharging.model.Vehicle;
import evcharging.pricing.*;
import evcharging.service.ChargingService;

public class Main {

    public static void main(String[] args) {

        ChargingService service = new ChargingService();

        service.addSlot(new ChargingSlot(1));
        service.addSlot(new ChargingSlot(2));

        service.addVehicle(new Vehicle("EV101", 10));
        service.addVehicle(new Vehicle("EV202", 15));

        try {
            service.processCharging(new PeakHourPricing());
        } catch (NoChargingSlotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}