package bank_account_hierarchy;

import java.util.Scanner;
import bank_account_hierarchy.impl.*;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Type (Savings/Checking): ");
        String type = sc.next();
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();
        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        BankAccount account;

        if ("savings".equalsIgnoreCase(type)) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CheckingAccount(accNo, balance);
        }

        System.out.printf("%.2f%n", account.calculateFee());
        sc.close();
    }
}
