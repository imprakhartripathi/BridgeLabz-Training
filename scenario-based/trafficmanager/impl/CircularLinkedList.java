package trafficmanager.impl;

public class CircularLinkedList {

    private VehicleNode tail;

    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        if (tail.next == tail) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    public void printRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode curr = tail.next;
        do {
            System.out.print(curr.vehicleNumber + " -> ");
            curr = curr.next;
        } while (curr != tail.next);

        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
