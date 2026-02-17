package coldstorage;

import coldstorage.exp.SensorFailureException;
import coldstorage.service.TemperatureService;

public class Main {

    public static void main(String[] args) {

        TemperatureService service = new TemperatureService();
        service.addRoom("R1");

        try {
            service.recordTemperature("R1", 5.0);
            service.recordTemperature("R1", 7.5);
            service.recordTemperature("R1", 9.0); // alert
        } catch (SensorFailureException e) {
            System.out.println(e.getMessage());
        }

        service.displayDailyAverage("R1");
    }
}