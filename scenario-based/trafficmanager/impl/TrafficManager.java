package trafficmanager.impl;

public class TrafficManager {

    private CircularLinkedList roundabout;
    private VehicleQueue waitingQueue;

    public TrafficManager(int queueCapacity) {
        roundabout = new CircularLinkedList();
        waitingQueue = new VehicleQueue(queueCapacity);
    }

    public void vehicleArrives(String vehicleNumber) {
        if (roundabout.isEmpty()) {
            roundabout.addVehicle(vehicleNumber);
        } else {
            waitingQueue.enqueue(vehicleNumber);
        }
    }

    public void vehicleExits() {
        roundabout.removeVehicle();
        String nextVehicle = waitingQueue.dequeue();
        if (nextVehicle != null) {
            roundabout.addVehicle(nextVehicle);
        }
    }

    public void printState() {
        System.out.println("Roundabout State:");
        roundabout.printRoundabout();
    }
}
