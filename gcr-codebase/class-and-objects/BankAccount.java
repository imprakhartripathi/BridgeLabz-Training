public class BankAccount {

    String accountHolder;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(
                "State of Chennai",
                "ACC001",
                700
        );

        acc.displayDetails();
        acc.deposit(200);
        acc.displayDetails();
        acc.withdraw(100);
        acc.displayDetails();
        acc.withdraw(1000);
    }
}
