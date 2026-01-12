public class VehicleOOPSD {
    private String ownerName;
    private String vehicleType;

    private static double registrationFee = 5000;

    public VehicleOOPSD(String ownerName, String vehicleType) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name is required");
        }
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        System.out.println("Vehicle Registered");
    }

    void displayVehicleDetails() {
        System.out.println(
            "Owner: " + ownerName +
            ", Vehicle: " + vehicleType +
            ", Registration Fee: " + registrationFee
        );
    }

    static void updateRegistrationFee(double fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("Fee cannot be negative");
        }
        registrationFee = fee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        VehicleOOPSD.updateRegistrationFee(6000);
        VehicleOOPSD v = new VehicleOOPSD("Sam", "Car");
        v.displayVehicleDetails();
    }
}
