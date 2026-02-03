package streamapi;

import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> prices = List.of(120.5, 118.3, 121.9);

        prices.forEach(price ->
                System.out.println("Stock Price: " + price)
        );
    }
}
