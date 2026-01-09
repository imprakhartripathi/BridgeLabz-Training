package hospital.impl;

public class InPatient extends Patient implements IPayable {
    private int days;
    private double dailyCharge;

    public InPatient(int id, String name, int days, double dailyCharge) {
        super(id, name);
        this.days = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return days * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + getName() + ", Bill: " + calculateBill());
    }
}
