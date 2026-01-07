package online_banking_system;

public class TransactionTask implements Runnable {

    private final BankService bankService;
    private final Account from;
    private final Account to;
    private final double amount;

    public TransactionTask(
            BankService bankService,
            Account from,
            Account to,
            double amount) {

        this.bankService = bankService;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            bankService.transfer(from, to, amount);
            System.out.println(Thread.currentThread().getName()
                    + " -> Transfer Successful");
        } catch (InsufficientBalanceException e) {
            System.out.println(Thread.currentThread().getName()
                    + " -> " + e.getMessage());
        }
    }
}
