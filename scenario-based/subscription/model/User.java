package subscription.model;

import java.time.LocalDate;

public class User {

    private String name;
    private LocalDate expiryDate;
    private boolean active;
    private double subscriptionFee;

    public User(String name, LocalDate expiryDate, double subscriptionFee) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.subscriptionFee = subscriptionFee;
        this.active = true;
    }

    public String getName() { return name; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate date) { this.expiryDate = date; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
    public double getSubscriptionFee() { return subscriptionFee; }
}