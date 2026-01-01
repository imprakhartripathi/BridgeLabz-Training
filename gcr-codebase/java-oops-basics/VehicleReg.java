public class VehicleReg {

    private static double registrationFee = 150;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VehicleReg(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayVehicle() {
        if (this instanceof VehicleReg) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        VehicleReg v1 = new VehicleReg("Honest raj", "Sedan", "ABC123");
        VehicleReg v2 = new VehicleReg("Price danish", "SUV", "XYZ789");

        v1.displayVehicle();
        v2.displayVehicle();
    }
}
