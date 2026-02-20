package trafficfine.model;

import java.time.LocalDate;

public abstract class Violation {

    protected LocalDate date;

    public Violation(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public abstract double calculateFine(int previousOffences);
}