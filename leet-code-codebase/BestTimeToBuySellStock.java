import java.util.Scanner;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of days: ");
            int n = sc.nextInt();

            int[] prices = new int[n];
            System.out.println("Enter stock prices:");
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }

            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;
                } else {
                    maxProfit = Math.max(maxProfit, price - minPrice);
                }
            }

            System.out.println("Maximum Profit: " + maxProfit);
        }
    }
}
