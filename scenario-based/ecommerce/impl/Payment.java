package ecommerce.impl;

public interface Payment {
    void pay(double amount) throws PaymentFailedException;
}
