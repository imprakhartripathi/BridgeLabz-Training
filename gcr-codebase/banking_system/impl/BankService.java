package banking_system.impl;

import java.util.*;

public class BankService {

    private final Map<String, Double> accounts = new HashMap<>();
    private final Queue<WithdrawalRequest> withdrawalQueue = new ArrayDeque<>();

    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void deposit(String accountNumber, double amount) {
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
    }

    public void requestWithdrawal(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            processSingleWithdrawal(request);
        }
    }

    private void processSingleWithdrawal(WithdrawalRequest request) {
        String acc = request.accountNumber;
        double amount = request.amount;

        if (!accounts.containsKey(acc)) {
            System.out.println("Invalid account: " + acc);
            return;
        }

        double balance = accounts.get(acc);

        if (balance >= amount) {
            accounts.put(acc, balance - amount);
            System.out.println("Withdrawal successful: " + acc + " → ₹" + amount);
        } else {
            System.out.println("Insufficient balance: " + acc);
        }
    }

    public void printSortedByBalance() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sorted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, List<String>> e : sorted.entrySet()) {
            for (String acc : e.getValue()) {
                System.out.println("Account: " + acc + " | Balance: ₹" + e.getKey());
            }
        }
    }

    public void printAccounts() {
        System.out.println(accounts);
    }

    private static class WithdrawalRequest {
        String accountNumber;
        double amount;

        WithdrawalRequest(String acc, double amt) {
            this.accountNumber = acc;
            this.amount = amt;
        }
    }
}
