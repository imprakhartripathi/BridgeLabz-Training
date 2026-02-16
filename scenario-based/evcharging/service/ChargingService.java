package evcharging.service;

import evcharging.exp.NoChargingSlotAvailableException;
import evcharging.model.ChargingSlot;
import evcharging.model.Vehicle;
import evcharging.pricing.PricingStrategy;

import java.util.*;

public class ChargingService {

    private Map<Integer, ChargingSlot> slotMap = new HashMap<>();
    private Queue<Vehicle> waitingQueue = new LinkedList<>();

    public void addSlot(ChargingSlot slot) {
        slotMap.put(slot.getSlotId(), slot);
    }

    public void addVehicle(Vehicle vehicle) {
        waitingQueue.offer(vehicle);
    }

    public void processCharging(PricingStrategy strategy)
            throws NoChargingSlotAvailableException {

        while (!waitingQueue.isEmpty()) {

            Vehicle vehicle = waitingQueue.poll();

            ChargingSlot availableSlot = slotMap.values()
                    .stream()
                    .filter(ChargingSlot::isAvailable)
                    .findFirst()
                    .orElseThrow(() ->
                            new NoChargingSlotAvailableException("No slot available"));

            availableSlot.setAvailable(false);

            double bill = strategy.calculatePrice(vehicle.getUnitsConsumed());

            System.out.println("Vehicle: " + vehicle.getVehicleNumber()
                    + " charged. Bill: ₹" + bill);

            availableSlot.setAvailable(true);
        }
    }
}