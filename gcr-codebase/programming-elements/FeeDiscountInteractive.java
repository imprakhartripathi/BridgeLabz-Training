import java.util.Scanner;

public class FeeDiscountInteractive {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the student fee (INR): ");
            double fee = sc.nextDouble();
            
            System.out.print("Enter the discount percentage: ");
            double discountPercent = sc.nextDouble();
            
            // Calculate discount: (discount % / 100) * fee, then subtract from original
            double discount = (discountPercent / 100.0) * fee;
            double discountedFee = fee - discount;
            
            System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        }
    }
}
