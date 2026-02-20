package trafficfine.model;

public class SpeedingViolation extends Violation {

    public SpeedingViolation(java.time.LocalDate date) {
        super(date);
    }

    @Override
    public double calculateFine(int previousOffences) {
        double baseFine = 1000;
        return previousOffences >= 2 ? baseFine * 1.5 : baseFine;
    }
}