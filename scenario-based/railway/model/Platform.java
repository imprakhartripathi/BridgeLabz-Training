package railway.model;

public class Platform {

    private int platformNumber;
    private boolean available = true;

    public Platform(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public int getPlatformNumber() { return platformNumber; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}