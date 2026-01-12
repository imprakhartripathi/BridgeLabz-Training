package hospital.impl;

public class Patient extends Person {
    private String medicalHistory;

    public Patient(int id, String name, String history) {
        super(id, name);
        this.medicalHistory = history;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}
