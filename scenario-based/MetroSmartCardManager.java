// Metro Smart Card Fare Deduction 🚇
// In Delhi Metro, fare varies by distance.
// ● Ask the user for distance.
// ● Calculate fare using ternary operator.
// ● Deduct from smart card balance.
// Loop until balance is exhausted or the user quits.

import java.util.Scanner;

public class MetroSmartCardManager {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter initial smart card balance: ");
            double balance = sc.nextDouble();
            
            while (balance > 0) {
                
                System.out.print("\nEnter distance in km (enter -1 to quit): ");
                int distance = sc.nextInt();
                
                // Exit condition
                if (distance == -1) {
                    break;
                }
                
                // Fare calculation using ternary operator
                double fare = distance <= 5 ? 10 :
                        distance <= 15 ? 20 : 30;
                
                if (balance < fare) {
                    System.out.println("Insufficient balance.");
                    break;
                }
                
                balance -= fare;
                
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            }
            
            System.out.println("\nJourney ended.");
            System.out.println("Final balance: ₹" + balance);
        }
    }
}
