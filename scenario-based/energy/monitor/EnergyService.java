package energy.monitor;

import java.time.LocalDate;
import java.util.*;

public class EnergyService {

    private Map<LocalDate, List<Double>> usageMap = new HashMap<>();

    public void addReading(LocalDate date, double reading) {
        if (reading < 0) {
            throw new InvalidEnergyReadingException("Reading cannot be negative");
        }

        usageMap.computeIfAbsent(date, k -> new ArrayList<>()).add(reading);
    }

    public double getDailyAverage(LocalDate date) {
        return usageMap.getOrDefault(date, List.of())
                .stream().mapToDouble(d -> d).average().orElse(0.0);
    }
}
