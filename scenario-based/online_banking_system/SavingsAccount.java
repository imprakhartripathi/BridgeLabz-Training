package online_banking_system;

public class SavingsAccount extends Account {

    public SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}
