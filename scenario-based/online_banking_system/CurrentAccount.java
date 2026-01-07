package online_banking_system;

public class CurrentAccount extends Account {

    public CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
