import java.util.Scanner;

public class BankAccountSBApp {

    static class BankAccountSB {
        @SuppressWarnings({"unused", "FieldMayBeFinal"})
        private String accountNumber;
        private double balance;

        public BankAccountSB(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Deposit amount must be positive.");
                return;
            }
            balance += amount;
            System.out.println("Deposit successful.");
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return;
            }
            if (amount > balance) {
                System.out.println("Insufficient balance. Overdraft not allowed.");
                return;
            }
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }

        public double checkBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        // Account creation
        try (Scanner sc = new Scanner(System.in)) {
            // Account creation
            System.out.print("Enter Account Number: ");
            String accNumber = sc.nextLine();
            
            System.out.print("Enter Initial Balance: ");
            double initialBalance = sc.nextDouble();
            
            BankAccountSB account = new BankAccountSB(accNumber, initialBalance);
            
            int choice;
            
            do {
                System.out.println("\n--- Bank Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                    }
                    case 2 -> {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    case 3 -> System.out.println("Current Balance: " + account.checkBalance());
                    case 4 -> System.out.println("Thank you for using the Bank App.");
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 4);
        }
    }
}
