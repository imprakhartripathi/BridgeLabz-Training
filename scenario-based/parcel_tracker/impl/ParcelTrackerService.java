package parcel_tracker.impl;

public class ParcelTrackerService {

    private ParcelNode head;

    public ParcelTrackerService() {
        this.head = null;
    }

    // Initialize base delivery chain
    public void initializeDefaultStages() {
        head = new ParcelNode("Packed");
        head.next = new ParcelNode("Shipped");
        head.next.next = new ParcelNode("In Transit");
        head.next.next.next = new ParcelNode("Delivered");
    }

    // Forward tracking through stages
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost: no tracking data available.");
            return;
        }

        ParcelNode current = head;
        System.out.println("Tracking parcel:");

        while (current != null) {
            System.out.println("==> " + current.stage);
            current = current.next;
        }
    }

    // Add intermediate checkpoint after a given stage
    public void addCheckpointAfter(String existingStage, String newStage) {
        ParcelNode current = head;

        while (current != null) {
            if (current.stage.equalsIgnoreCase(existingStage)) {
                ParcelNode newNode = new ParcelNode(newStage);
                newNode.next = current.next;
                current.next = newNode;
                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            current = current.next;
        }

        System.out.println("Stage not found: " + existingStage);
    }

    // Simulate lost/missing parcel (null pointer break)
    public void markParcelLostAfter(String stage) {
        ParcelNode current = head;

        while (current != null) {
            if (current.stage.equalsIgnoreCase(stage)) {
                current.next = null;
                System.out.println("Parcel lost after stage: " + stage);
                return;
            }
            current = current.next;
        }
    }
}
