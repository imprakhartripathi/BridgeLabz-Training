package wallet;

import wallet.impl.*;

public class Driver {
    public static void main(String[] args) {

        User u1 = new User(1, "Prakhar");
        User u2 = new User(2, "Shashank");

        u1.addMoney(2000);

        TransferService transfer = new WalletTransfer();
        try {
            transfer.transfer(u1.getWallet(), u2.getWallet(), 750);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- " + u1.getName() + "'s Transactions ---");
        u1.getWallet().printTransactions();

        System.out.println("\n--- " + u2.getName() + "'s Transactions ---");
        u2.getWallet().printTransactions();

        System.out.println("\nFinal Balances:");
        System.out.println(u1.getName() + ": ₹" + u1.getWallet().getBalance());
        System.out.println(u2.getName() + ": ₹" + u2.getWallet().getBalance());
    }
}
