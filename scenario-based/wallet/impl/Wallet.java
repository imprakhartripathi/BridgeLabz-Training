package wallet.impl;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private User owner;

    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Wallet(User owner) {
        this.owner = owner;
    }

    public Wallet() {
    }

    public User getOwner() {
        return owner;
    }

    public void addMoney(double amt) {
        balance += amt;
        transactions.add(new Transaction(amt, "CREDIT"));
    }

    public void deduct(double amt) throws InsufficientBalanceException {
        if (balance < amt)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amt;
        transactions.add(new Transaction(amt, "DEBIT"));
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            t.printTransaction();
        }
    }
}
