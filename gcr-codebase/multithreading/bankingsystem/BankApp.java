package multithreading.bankingsystem;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        int[] amounts = {3000, 4000, 2000, 5000, 1500};

        for (int i = 0; i < amounts.length; i++) {
            Thread t = new Thread(
                    new Transaction(account, "Customer-" + (i + 1), amounts[i]),
                    "ATM-" + (i + 1)
            );
            t.start();
        }
    }
}
