package online_banking_system;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}
