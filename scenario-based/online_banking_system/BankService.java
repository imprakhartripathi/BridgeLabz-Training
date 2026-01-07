package online_banking_system;

public interface BankService {

    void transfer(Account from, Account to, double amount)
            throws InsufficientBalanceException;
}
