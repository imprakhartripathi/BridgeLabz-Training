package wallet.impl;

import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;

    private int transactionId;
    private double amount;
    private String type;
    private LocalDateTime timestamp;

    public Transaction(double amount, String type) {
        this.transactionId = counter++;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public void printTransaction() {
        System.out.println(
                "TxnID: " + transactionId +
                        " | Type: " + type +
                        " | Amount: ₹" + amount +
                        " | Time: " + timestamp
        );
    }
}
