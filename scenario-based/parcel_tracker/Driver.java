package parcel_tracker;

import parcel_tracker.impl.ParcelTrackerService;

public class Driver {
    public static void main(String[] args) {

        ParcelTrackerService tracker = new ParcelTrackerService();

        tracker.initializeDefaultStages();
        tracker.trackParcel();

        System.out.println("\nAdding custom checkpoint...");
        tracker.addCheckpointAfter("Shipped", "Customs Clearance");
        tracker.trackParcel();

        System.out.println("\nSimulating lost parcel...");
        tracker.markParcelLostAfter("Customs Clearance");
        tracker.trackParcel();
    }
}
