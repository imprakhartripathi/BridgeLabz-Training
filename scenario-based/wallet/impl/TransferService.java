package wallet.impl;

public interface TransferService {
    void transfer(Wallet from, Wallet to, double amt)
            throws InsufficientBalanceException;
}
