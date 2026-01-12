package ecommerce.impl;

public class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount > 100000)
            throw new PaymentFailedException("UPI daily limit exceeded");
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
