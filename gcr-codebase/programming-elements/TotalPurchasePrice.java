public class TotalPurchasePrice {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter the unit price of the item: ");
            double unitPrice = sc.nextDouble();
            
            System.out.print("Enter the quantity to be bought: ");
            int quantity = sc.nextInt();
            
            double totalPrice = unitPrice * quantity;
            
            System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        }
    }
}
