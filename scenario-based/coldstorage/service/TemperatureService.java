package coldstorage.service;

import coldstorage.model.TemperatureLog;
import coldstorage.exp.SensorFailureException;

import java.util.HashMap;
import java.util.Map;

public class TemperatureService {

    private Map<String, TemperatureLog> roomMap = new HashMap<>();
    private final double SAFE_MIN = 2.0;
    private final double SAFE_MAX = 8.0;

    public void addRoom(String roomId) {
        roomMap.put(roomId, new TemperatureLog());
    }

    public void recordTemperature(String roomId, double temperature)
            throws SensorFailureException {

        if (!roomMap.containsKey(roomId)) {
            throw new SensorFailureException("Sensor failure or room not found.");
        }

        TemperatureLog log = roomMap.get(roomId);
        log.addReading(temperature);

        if (temperature < SAFE_MIN || temperature > SAFE_MAX) {
            System.out.println("ALERT: Temperature out of safe range in Room " + roomId);
        }
    }

    public void displayDailyAverage(String roomId) {
        TemperatureLog log = roomMap.get(roomId);
        if (log != null) {
            System.out.println("Daily Average for Room " + roomId +
                    " : " + log.calculateAverage());
        }
    }
}