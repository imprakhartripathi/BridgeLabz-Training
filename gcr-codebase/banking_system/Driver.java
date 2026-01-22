package banking_system;

import banking_system.impl.BankService;

public class Driver {
    public static void main(String[] args) {

        BankService bank = new BankService();

        bank.createAccount("ACC1001", 5000);
        bank.createAccount("ACC1002", 12000);
        bank.createAccount("ACC1003", 3000);

        bank.deposit("ACC1001", 2000);

        bank.requestWithdrawal("ACC1001", 4000);
        bank.requestWithdrawal("ACC1003", 5000);
        bank.requestWithdrawal("ACC1002", 3000);

        bank.processWithdrawals();

        System.out.println("\nFinal Account State:");
        bank.printAccounts();

        System.out.println("\nSorted By Balance:");
        bank.printSortedByBalance();
    }
}
