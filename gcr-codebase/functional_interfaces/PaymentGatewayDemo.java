package functional_interfaces;

interface PaymentProcessor {
    void pay();
    default void refund() {
        System.out.println("Refund processed");
    }
}

class Gateway implements PaymentProcessor {
    public void pay() {
        System.out.println("Payment done");
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor p = new Gateway();
        p.pay();
        p.refund();
    }
}
