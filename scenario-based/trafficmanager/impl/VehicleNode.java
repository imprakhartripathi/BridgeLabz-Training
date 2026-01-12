package trafficmanager.impl;

public class VehicleNode {
    public String vehicleNumber;
    public VehicleNode next;

    public VehicleNode(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
