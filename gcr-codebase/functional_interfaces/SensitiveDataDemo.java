package functional_interfaces;

interface Sensitive {}

class Account implements Sensitive {}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a instanceof Sensitive ? "Encrypt data" : "Normal data");
    }
}
