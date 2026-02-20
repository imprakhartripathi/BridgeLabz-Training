package trafficfine.model;

public class SignalJumpViolation extends Violation {

    public SignalJumpViolation(java.time.LocalDate date) {
        super(date);
    }

    @Override
    public double calculateFine(int previousOffences) {
        double baseFine = 1500;
        return previousOffences >= 2 ? baseFine * 2 : baseFine;
    }
}