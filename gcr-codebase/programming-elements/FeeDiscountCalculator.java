public class FeeDiscountCalculator {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount: (discount % / 100) * original fee
        double discount = (discountPercent / 100.0) * fee;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
