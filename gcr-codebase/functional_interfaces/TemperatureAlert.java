package functional_interfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 45.0;
        System.out.println(alert.test(50.0) ? "ALERT!" : "Normal");
    }
}
