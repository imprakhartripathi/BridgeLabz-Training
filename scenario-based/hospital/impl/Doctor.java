package hospital.impl;

public class Doctor {
    private int id;
    private String specialization;

    public Doctor(int id, String specialization) {
        this.id = id;
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("Doctor ID: " + id + ", Specialization: " + specialization);
    }
}
