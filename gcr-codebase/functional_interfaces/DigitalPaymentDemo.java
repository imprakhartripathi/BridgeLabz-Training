package functional_interfaces;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}

public class DigitalPaymentDemo {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);
    }
}
