package streamapi;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim("Health", 5000),
                new Claim("Health", 7000),
                new Claim("Vehicle", 12000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                c -> c.type,
                                Collectors.averagingDouble(c -> c.amount)
                        ));

        System.out.println(avgClaimByType);
    }
}
