package hospital.impl;

public class OutPatient extends Patient implements IPayable {
    private double consultationFee;

    public OutPatient(int id, String name, double consultationFee) {
        super(id, name);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + getName() + ", Bill: " + calculateBill());
    }
}
