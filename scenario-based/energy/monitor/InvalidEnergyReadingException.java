package energy.monitor;

public class InvalidEnergyReadingException extends RuntimeException {

    public InvalidEnergyReadingException(String message) {
        super(message);
    }
}
