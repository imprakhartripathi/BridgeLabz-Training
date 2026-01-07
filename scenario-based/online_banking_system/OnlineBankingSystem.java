package online_banking_system;

import java.util.Scanner;

public class OnlineBankingSystem {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Savings Account Balance: ");
            double savingsBalance = sc.nextDouble();

            System.out.print("Enter Current Account Balance: ");
            double currentBalance = sc.nextDouble();

            Account savings = new SavingsAccount(1001, savingsBalance);
            Account current = new CurrentAccount(2001, currentBalance);

            BankService bankService = new BankServiceImpl();

            System.out.print("Enter transfer amount: ");
            double amount = sc.nextDouble();

            Runnable transaction = new TransactionTask(bankService, savings, current, amount);

            Thread t1 = new Thread(transaction, "Thread-1");
            Thread t2 = new Thread(transaction, "Thread-2");

            t1.start();
            t2.start();
        }
    }
}
