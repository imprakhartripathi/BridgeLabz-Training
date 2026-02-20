package trafficfine;

import trafficfine.model.*;
import trafficfine.service.TrafficFineService;
import trafficfine.exp.InvalidVehicleException;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        TrafficFineService service = new TrafficFineService();

        service.registerVehicle("DL01AB1234");

        try {
            service.recordViolation("DL01AB1234",
                    new SpeedingViolation(LocalDate.of(2025, 1, 10)));

            service.recordViolation("DL01AB1234",
                    new SignalJumpViolation(LocalDate.of(2025, 1, 15)));

            service.recordViolation("DL01AB1234",
                    new SpeedingViolation(LocalDate.of(2025, 1, 20)));

        } catch (InvalidVehicleException e) {
            System.out.println(e.getMessage());
        }

        service.generateMonthlyReport(Month.JANUARY);
    }
}