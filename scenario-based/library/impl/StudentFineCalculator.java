package library.impl;

public class StudentFineCalculator implements FineCalculator {
    public double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}
