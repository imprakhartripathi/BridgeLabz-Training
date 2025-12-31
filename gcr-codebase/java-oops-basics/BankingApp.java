public class BankingApp {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = 1001;
        sa.accountHolder = "Alex";
        sa.setBalance(25000);

        sa.display();
        System.out.println("Balance in " + sa.accountNumber + " : " + sa.getBalance());
    }

    static class BankAccount {
        public int accountNumber;
        protected String accountHolder;
        private double balance;

        public void setBalance(double b) {
            balance = b;
            System.out.println("Balance set to: " + balance + " for account holder: " + accountHolder);
        }

        public double getBalance() {
            return balance;
        }
    }

    static class SavingsAccount extends BankAccount {
        void display() {
            System.out.println("Account Number: " + accountNumber + " Account Holder: " + accountHolder);
        }
    }
}
