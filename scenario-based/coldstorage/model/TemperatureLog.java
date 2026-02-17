package coldstorage.model;

import java.util.ArrayList;
import java.util.List;

public class TemperatureLog {

    private List<Double> readings = new ArrayList<>();

    public void addReading(double temperature) {
        readings.add(temperature);
    }

    public List<Double> getReadings() {
        return readings;
    }

    public double calculateAverage() {
        if (readings.isEmpty()) return 0;

        double sum = 0;
        for (double temp : readings) {
            sum += temp;
        }
        return sum / readings.size();
    }
}