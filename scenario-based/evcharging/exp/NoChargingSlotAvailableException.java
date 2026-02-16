package evcharging.exp;

public class NoChargingSlotAvailableException extends Exception {

    public NoChargingSlotAvailableException(String message) {
        super(message);
    }
}