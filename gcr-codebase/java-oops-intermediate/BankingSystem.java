interface Loanable {
    void applyForLoan();

    double calculateLoanEligibility();
}

abstract class BankAccount {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private String accountNumber;
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private String holderName;
    private double balance;

    protected BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
    }

    protected double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}

@SuppressWarnings("unused")
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("S123", "John", 100000);
        System.out.println(acc.calculateInterest());
    }
}
