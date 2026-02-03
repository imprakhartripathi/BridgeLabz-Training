package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderRevenue {

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Alice", 120.0),
                new Order("Bob", 200.0),
                new Order("Alice", 80.0)
        );

        Map<String, Double> revenue =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                o -> o.customer,
                                Collectors.summingDouble(o -> o.amount)
                        ));

        System.out.println(revenue);
    }
}
