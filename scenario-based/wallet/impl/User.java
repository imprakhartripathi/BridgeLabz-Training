package wallet.impl;

public class User {
    private int id;
    private String name;
    private Wallet wallet;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.wallet = new Wallet(this);
    }

    public String getName() {
        return name;
    }

    // Controlled access
    public Wallet getWallet() {
        return wallet;
    }

    // Domain-level actions
    public void addMoney(double amount) {
        wallet.addMoney(amount);
    }
}
