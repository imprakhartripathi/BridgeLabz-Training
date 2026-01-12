package wallet.impl;

public class BankTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amt)
            throws InsufficientBalanceException {
        from.deduct(amt);
        to.addMoney(amt);
    }
}
