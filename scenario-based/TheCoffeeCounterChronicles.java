// The Coffee Counter Chronicles ☕
// Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
// that:
// ● Asks for coffee type (switch)
// ● Calculates total bill (price * quantity)
// ● Adds GST using arithmetic operators
// Use while to continue for the next customer and break when "exit" is typed.

import java.util.Scanner;

public class TheCoffeeCounterChronicles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final double GST = 0.18; // 18% GST
            String coffeeType;
            
            System.out.println("Welcome to Ravi's Cafe!!");
            System.out.println("Available coffee types: espresso (Rs. 99), latte (Rs. 129), cappuccino (Rs. 149)");
            System.out.println();
            
            while (true) {
                System.out.print("Enter coffee type or 'exit' to quit: ");
                coffeeType = sc.nextLine().toLowerCase();
                
                if (coffeeType.equals("exit")) {
                    System.out.println("Exiting. Thank you!");
                    break;
                }
                
                double pricePerCup;
                switch (coffeeType) {
                    case "espresso":
                        pricePerCup = 99.00;
                        break;
                    case "latte":
                        pricePerCup = 129.00;
                        break;
                    case "cappuccino":
                        pricePerCup = 149.00;
                        break;
                    default:
                        System.out.println("Invalid coffee type. Please try again.");
                        continue;
                }
                
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine(); // Consume newline 
                System.out.println();
                
                double totalBill = pricePerCup * quantity;
                double gstAmount = totalBill * GST;
                double finalAmount = totalBill + gstAmount;

                System.out.println("---------------- Bill Details ----------------");
                System.out.println();          
                System.out.println("Total bill (before GST): Rs. " + totalBill);
                System.out.println("GST amount: Rs. " + gstAmount);
                System.out.println("Final amount to pay: Rs. " + finalAmount);
                System.out.println("----------------------------------------------\n");
            }
        }
    }
}
