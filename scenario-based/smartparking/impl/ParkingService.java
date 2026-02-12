package smartparking.impl;

import java.util.*;

public class ParkingService {

    private Map<Integer, ParkingSlot> slotMap = new TreeMap<>();
    private Queue<Vehicle> waitingQueue = new LinkedList<>();

    public void addSlot(ParkingSlot slot) {
        slotMap.put(slot.getSlotNumber(), slot);
        System.out.println("Slot " + slot.getSlotNumber() + " added successfully.");
    }

    public void addVehicle(Vehicle vehicle) {
        waitingQueue.offer(vehicle);
        System.out.println(vehicle.getType() + " "
                + vehicle.getRegistrationNumber()
                + " added to waiting queue.");
    }

    public void processParking() {

        while (!waitingQueue.isEmpty()) {

            Vehicle vehicle = waitingQueue.peek();

            try {
                ParkingSlot slot = getNearestFreeSlot();
                slot.occupy();

                System.out.println("Success: "
                        + vehicle.getType() + " "
                        + vehicle.getRegistrationNumber()
                        + " parked at slot "
                        + slot.getSlotNumber());

                waitingQueue.poll();

            } catch (NoParkingSlotAvailableException e) {

                System.out.println("No slots available. "
                        + vehicle.getRegistrationNumber()
                        + " remains in waiting queue.");
                break;
            }
        }
    }

    public void vacateSlot(int slotNumber) {

        ParkingSlot slot = slotMap.get(slotNumber);

        if (slot != null && slot.isOccupied()) {
            slot.vacate();
            System.out.println("Slot " + slotNumber + " is now free.");

            processParking();
        }
    }

    private ParkingSlot getNearestFreeSlot()
            throws NoParkingSlotAvailableException {

        for (ParkingSlot slot : slotMap.values()) {
            if (!slot.isOccupied()) {
                return slot;
            }
        }

        throw new NoParkingSlotAvailableException("No parking slot available");
    }
}
