package trafficfine.model;

import java.util.ArrayList;
import java.util.List;

public class VehicleRecord {

    private String vehicleNumber;
    private List<Violation> violations = new ArrayList<>();

    public VehicleRecord(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public List<Violation> getViolations() {
        return violations;
    }

    public void addViolation(Violation violation) {
        violations.add(violation);
    }
}