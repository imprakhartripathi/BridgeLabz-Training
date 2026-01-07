package online_banking_system;

public abstract class Account {

    protected final int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount)
            throws InsufficientBalanceException {

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }

    public abstract double calculateInterest();
}
