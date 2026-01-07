package online_banking_system;

public class BankServiceImpl implements BankService {

    @Override
    public void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException {

        // consistent lock ordering avoids deadlock
        synchronized (from) {
            synchronized (to) {
                from.withdraw(amount);
                to.deposit(amount);
            }
        }
    }
}
