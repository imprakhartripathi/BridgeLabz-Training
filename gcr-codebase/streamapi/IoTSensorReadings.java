package streamapi;

import java.util.List;

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<Double> readings = List.of(22.5, 35.1, 18.9, 40.0);
        double threshold = 30.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}
