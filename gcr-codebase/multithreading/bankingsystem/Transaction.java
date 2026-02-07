package multithreading.bankingsystem;

public class Transaction implements Runnable {

    private BankAccount account;
    private String customer;
    private int amount;

    public Transaction(BankAccount account, String customer, int amount) {
        this.account = account;
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " State: " + Thread.currentThread().getState());
        account.withdraw(customer, amount);
    }
}
