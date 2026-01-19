package parceltracker.impl;

public class ParcelTracker {

    private ParcelNode head;

    public void addStage(String stage) {
        ParcelNode node = new ParcelNode(stage);

        if (head == null) {
            head = node;
            return;
        }

        ParcelNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public boolean addCheckpointAfter(String existing, String checkpoint) {
        ParcelNode curr = head;

        while (curr != null) {
            if (curr.stage.equalsIgnoreCase(existing)) {
                ParcelNode node = new ParcelNode(checkpoint);
                node.next = curr.next;
                curr.next = node;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void displayTracking() {
        if (head == null) {
            System.out.println("Parcel lost or tracking not initialized.");
            return;
        }

        ParcelNode curr = head;
        while (curr != null) {
            System.out.print(curr.stage);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
