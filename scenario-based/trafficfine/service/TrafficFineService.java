package trafficfine.service;

import trafficfine.model.*;
import trafficfine.exp.InvalidVehicleException;

import java.time.Month;
import java.util.*;

public class TrafficFineService {

    private Map<String, VehicleRecord> violationMap = new HashMap<>();

    public void registerVehicle(String vehicleNumber) {
        violationMap.put(vehicleNumber, new VehicleRecord(vehicleNumber));
    }

    public void recordViolation(String vehicleNumber, Violation violation)
            throws InvalidVehicleException {

        VehicleRecord record = violationMap.get(vehicleNumber);

        if (record == null) {
            throw new InvalidVehicleException("Vehicle not registered: " + vehicleNumber);
        }

        record.addViolation(violation);

        int previousOffences = record.getViolations().size() - 1;
        double fine = violation.calculateFine(previousOffences);

        System.out.println("Violation recorded for " + vehicleNumber +
                " | Fine: ₹" + fine);
    }

    public void generateMonthlyReport(Month month) {

        System.out.println("=== Monthly Report for " + month + " ===");

        violationMap.values().forEach(record -> {

            double totalFine = record.getViolations().stream()
                    .filter(v -> v.getDate().getMonth() == month)
                    .mapToDouble(v ->
                            v.calculateFine(
                                    record.getViolations().indexOf(v)))
                    .sum();

            if (totalFine > 0) {
                System.out.println("Vehicle: " + record.getVehicleNumber()
                        + " | Total Fine: ₹" + totalFine);
            }
        });
    }
}