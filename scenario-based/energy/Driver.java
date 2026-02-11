package energy;

import energy.monitor.*;

import java.time.LocalDate;

public class Driver {

    public static void main(String[] args) {

        EnergyService service = new EnergyService();

        try {
            service.addReading(LocalDate.now(), 12.5);
            service.addReading(LocalDate.now(), 15.0);
            service.addReading(LocalDate.now(), -3.0); // invalid

        } catch (InvalidEnergyReadingException e) {
            System.out.println("Error: " + e.getMessage());
        }

        double avg = service.getDailyAverage(LocalDate.now());
        System.out.println("Today's Average Consumption: " + avg);
    }
}
