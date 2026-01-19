package parceltracker.impl;

public class ParcelNode {
    public String stage;
    public ParcelNode next;

    public ParcelNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
