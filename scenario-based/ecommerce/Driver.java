package ecommerce;

import ecommerce.impl.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //need to add user input product selection
        Product product = new Product(1, "Laptop", 45000);
        Order order = new Order(product);

        System.out.println("Select Payment Method:");
        System.out.println("1. Card\n2. UPI\n3. Wallet");

        int choice = sc.nextInt();
        Payment payment = null;

        switch (choice) {
            case 1: payment = new CardPayment(); break;
            case 2: payment = new UPIPayment(); break;
            case 3: payment = new WalletPayment(); break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        try {
            payment.pay(order.getAmount());
            System.out.println("Order placed successfully");
        } catch (PaymentFailedException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }
}
