package library.impl;

public class StaffFineCalculator implements FineCalculator {
    public double calculateFine(int daysLate) {
        return daysLate;
    }
}
