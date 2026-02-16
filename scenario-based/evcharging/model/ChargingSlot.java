package evcharging.model;

public class ChargingSlot {

    private int slotId;
    private boolean available = true;

    public ChargingSlot(int slotId) {
        this.slotId = slotId;
    }

    public int getSlotId() { return slotId; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}