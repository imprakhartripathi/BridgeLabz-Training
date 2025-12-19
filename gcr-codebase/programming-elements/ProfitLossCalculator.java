public class ProfitLossCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        // Profit = Selling Price - Cost Price
        int profit = sellingPrice - costPrice;
        // Profit Percentage = (Profit / Cost Price) * 100
        double profitPercentage = (profit / (double) costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
